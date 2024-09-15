package in.ineuron;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.service.ICoronaVaccineService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpa01Application.class, args);
		ICoronaVaccineService service = context.getBean(ICoronaVaccineService.class);

//		List<CoronaVaccine> fetchVaccineByCompany = service.fetchVaccineByCompany("serum");
//		fetchVaccineByCompany.forEach(System.out::println);
		
//		service.fetchVaccineByPriceLessThan(600.0).forEach(System.out::println);;
		
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		service.getVaccineByCountryInPriceRange(countries, 1000.0, 450.0).forEach(System.out::println);
		
		((ConfigurableApplicationContext) context).close();
	}

}
