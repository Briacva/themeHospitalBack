package lieux.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LieuxApplication {

	public static void main(String[] args) {
		
	 SpringApplication.run(LieuxApplication.class, args);
		System.out.println("on est dans lieu application");
	}

	@GetMapping("/")

	public String hello() {
		return "This lieu application";
	}
	
	
}
