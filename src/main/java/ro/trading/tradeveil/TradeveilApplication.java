package ro.trading.tradeveil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class TradeveilApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeveilApplication.class, args);
	}

}
