package ppdapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.access.annotation.Secured;
@SpringBootApplication
@EnableAsync
public class PuppyPlayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuppyPlayDateApplication.class, args);
	}

}
