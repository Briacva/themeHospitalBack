package patient.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PatientApplication {

	public static void main(String[] args) {
		 SpringApplication.run(PatientApplication.class, args);
		System.out.println("on est dans patient application");

	}

}
