package sejour.application;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SejourApplication {

	public static void main(String[] args) {
		SpringApplication.run(SejourApplication.class, args);
		System.out.println("on est dans Sejour application");

	}

	@GetMapping("/")

	public String hello() {
		return "This sejour application";
	}
}
