package patient.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientApplication {

	public static void main(String[] args) {
		 SpringApplication.run(PatientApplication.class, args);
		System.out.println("on est dans patient application");

	}

}
