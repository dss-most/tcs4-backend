package th.go.dss.tcs4.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	
	public static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/test")
	@CrossOrigin(origins = "*", maxAge = 3600,
    allowedHeaders={"x-auth-token", "x-requested-with", "x-xsrf-token"})
	  public Message home() {
		
		logger.error("/test is called");
		
	    return new Message("Hello World");
	  }
}


class Message {
	  private String id = UUID.randomUUID().toString();
	  private String content;
	  public Message(String content) {
	    this.content = content;
	  }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	  
	  
}