package th.go.dss.tcs4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import th.go.dss.tcs4.services.EntityService;
import th.go.dss.tcs4.services.EntityServiceJPA;


@SpringBootApplication
public class Tcs4BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tcs4BackendApplication.class, args);
	}
	
	@Bean
	public EntityService entityService() {
		return new EntityServiceJPA();
	}
	
}
