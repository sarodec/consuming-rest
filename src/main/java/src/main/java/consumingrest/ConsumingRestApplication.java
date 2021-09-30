package src.main.java.consumingrest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.security.PublicKey;

/**
 * When one web service is running on port 8080, call that service and consume the data return by that
 */
@SpringBootApplication
public class ConsumingRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	@Bean
	public CommandLineRunner run (RestTemplate restTemplate) {
		return args -> {
			Item item = restTemplate.getForObject("http://localhost:8080/showItem", Item.class);
			System.out.println(item);
		};
	}
}
