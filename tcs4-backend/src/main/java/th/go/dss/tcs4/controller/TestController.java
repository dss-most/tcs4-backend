package th.go.dss.tcs4.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/test")
	  public Message home() {
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