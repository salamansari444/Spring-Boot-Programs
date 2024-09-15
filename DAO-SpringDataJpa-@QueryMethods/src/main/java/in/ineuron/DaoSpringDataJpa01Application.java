package in.ineuron;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.ICoronaVaccineService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpa01Application.class, args);
		ICoronaVaccineService service = context.getBean(ICoronaVaccineService.class);

		service.fetchVaccineByCompany("bhaarat").forEach(System.out::println);;
		
		((ConfigurableApplicationContext) context).close();
	}

}
