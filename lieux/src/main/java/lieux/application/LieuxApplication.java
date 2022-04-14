package lieux.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class LieuxApplication {

	public static void main(String[] args) {
	 SpringApplication.run(LieuxApplication.class, args);
		System.out.println("on est dans lieu application");
	}

}
