package tn.esprit.testprojet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TestProjetApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjetApplication.class, args);
	}

}
