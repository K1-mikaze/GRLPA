package PICUR_GRLPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing 
public class GrlpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrlpaApplication.class, args);
	}

}
