package in.ineuron.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class EmailReportRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("EmailReportRunner.run()");
		System.out.println("Args[0] : "+args[0]);
		System.out.println("Arguments are : "+Arrays.asList(args));
		
	}

}
