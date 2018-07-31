package th.go.dss.tcs4.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
			  @RequestParam Integer pageNum, @RequestParam Integer pageSize) {
		logger.error("/TestMethod is called");
		PageRequest pageRequest =
	           PageRequest.of(pageNum, pageSize);
		
	    return entityService.findAllTestMethod(pageRequest);
	  }
	
}
