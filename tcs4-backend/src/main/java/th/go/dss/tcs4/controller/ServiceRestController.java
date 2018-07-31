package th.go.dss.tcs4.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.go.dss.tcs4.model.lab.TestMethod;
import th.go.dss.tcs4.services.EntityService;

@RestController
public class ServiceRestController {
	
	public static Logger logger = LoggerFactory.getLogger(ServiceRestController.class);
	
	@Autowired
	private EntityService entityService;
	
	
	@RequestMapping("/TestMethod")
	@CrossOrigin(origins = "*", maxAge = 3600,
    	allowedHeaders={"x-auth-token", "x-requested-with", "x-xsrf-token"})
	  public Iterable<TestMethod> findAllTestMethod() {
		
		logger.error("/TestMethod is called");

	    return entityService.findAllTestMethod();
	  }
	
}
