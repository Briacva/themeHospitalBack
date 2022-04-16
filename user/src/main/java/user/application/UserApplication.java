package user.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class UserApplication {
@RequestMapping("/")
public String home( ) {
	JSONObject jsonObject = new JSONObject();
	jsonObject.put("message", "TRAVAIL ");
			return jsonObject.toString();
}

	public static void main(String[] args) {
		 SpringApplication.run(UserApplication.class, args);//methode qui permet de creer le projet en spring boot
		System.out.println("on est dans user application");

	}

}
  