package in.ineuron.runners;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
public class ExportPDFRunner  {
	
	@Bean
	public CommandLineRunner runA() {
		CommandLineRunner obj=(args)->{
			System.out.println("From Runner : "+Arrays.asList(args));
		};
		return obj;
	} 
	

}
