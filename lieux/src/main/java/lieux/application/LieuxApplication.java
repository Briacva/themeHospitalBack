package lieux.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import net.minidev.json.JSONObject;



@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class })  
@RestController
public class LieuxApplication {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String home() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", "hello Lieux");
    
		return jsonObject.toString();
	}

	public static void main(String[] args) {
	 SpringApplication.run(LieuxApplication.class, args);
		System.out.println("on est dans lieu application");
	}

}
