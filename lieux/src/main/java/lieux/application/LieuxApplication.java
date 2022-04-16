package lieux.application;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class LieuxApplication {
@RequestMapping("/")
public String home( ) {
	JSONObject jsonObject = new JSONObject();
	jsonObject.put("message", "RENTRE ");
			return jsonObject.toString();
}

	public static void main(String[] args) {
	 SpringApplication.run(LieuxApplication.class, args);
		System.out.println("on est dans lieu application");
	}

}
