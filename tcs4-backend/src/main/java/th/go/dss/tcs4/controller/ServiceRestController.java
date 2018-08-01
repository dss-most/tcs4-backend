package th.go.dss.tcs4.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import th.go.dss.tcs4.model.lab.TestMethod;
import th.go.dss.tcs4.services.EntityService;

@RestController
public class ServiceRestController {
	
	public static Logger logger = LoggerFactory.getLogger(ServiceRestController.class);
	
	@Autowired
	private EntityService entityService;
	
	
	@RequestMapping("/TestMethod")
	@CrossOrigin()
	  public Page<TestMethod> findAllTestMethod(
			  @RequestParam Integer pageNum, @RequestParam Integer pageSize, 
			  @RequestParam String sortField, @RequestParam String sortDirection) {
		logger.debug("/TestMethod is called");
		logger.debug("sortField: " + sortField);
		logger.debug("sortDirection: " + sortDirection);
		
		Sort sort =null;
		
		if(sortField.length() > 0) {
			Direction direction;
			if(sortDirection.equals("desc")) {
				direction = Direction.DESC;
			} else {
				direction = Direction.ASC;
			}
			
			sort = Sort.by(direction, sortField);
		} else {
			sort = Sort.by(Direction.ASC, "id");
		}
		
		PageRequest pageRequest =
	           PageRequest.of(pageNum, pageSize, sort);
		
		
		
		//Sort.by(direction, properties)
		
	    return entityService.findAllTestMethod(pageRequest);
	  }
	
}
