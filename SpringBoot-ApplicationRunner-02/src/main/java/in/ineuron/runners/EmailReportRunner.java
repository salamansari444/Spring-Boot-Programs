package in.ineuron.runners;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class EmailReportRunner implements ApplicationRunner {


	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Application Runner args : "+args.getSourceArgs());
		
		System.out.println("Optional Args  : "+args.getOptionNames());
		System.out.println("Non optional Args : "+args.getNonOptionArgs());
		
	}

}
