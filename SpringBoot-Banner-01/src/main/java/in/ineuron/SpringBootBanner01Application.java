package in.ineuron;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootBanner01Application {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication();
		springApplication.setBannerMode(Mode.CONSOLE);
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootBanner01Application.class, args);
		ctx.close();
	}

}
