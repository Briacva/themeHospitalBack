package sejour.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SejourApplication {

	public static void main(String[] args) {
		 SpringApplication.run(SejourApplication.class, args);
		System.out.println("on est dans Sejour application");

	}

}
