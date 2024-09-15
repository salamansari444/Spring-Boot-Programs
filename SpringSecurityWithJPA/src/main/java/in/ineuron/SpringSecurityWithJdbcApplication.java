package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringSecurityWithJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithJdbcApplication.class, args);
	}

}
