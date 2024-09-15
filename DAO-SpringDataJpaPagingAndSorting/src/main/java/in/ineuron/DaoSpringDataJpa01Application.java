package in.ineuron;

import java.util.ArrayList;
import java.util.List;

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
//		CoronaVaccine vaccine = new CoronaVaccine(null, "Covisheild", "bhaarat", "India", 894.9, 3);
//		System.out.println(service.register(vaccine));
		
//		boolean vaccineExist = service.checkVaccineExist((long) 2.0);
//		System.out.println(vaccineExist);
		
//		System.out.println(service.getVaccineCount());
		
//		List<CoronaVaccine> vaccines = new ArrayList<CoronaVaccine>();
//		vaccines.add(new CoronaVaccine(null,  "pyzer", "pyzwer", "USA", 678.8, 2));
//		vaccines.add(new CoronaVaccine(null,  "moderena", "pyzwer", "USA", 987.8, 2));
//		vaccines.add(new CoronaVaccine(null,  "sputnik", "russs", "Russia", 598.8, 2));
//		service.registerInBatch(vaccines);
		
		
//		Iterable<CoronaVaccine> fetchAllDetails = service.fetchAllDetails();
//		fetchAllDetails.forEach(System.out::println);
		
//		List<Long> ids = new ArrayList<Long>();
//		ids.add(2L);
//		ids.add(1L);
//		ids.add(5L);
//		Iterable<CoronaVaccine> fetchByIds = service.fetchById(ids);
//		fetchByIds.forEach(System.out::println);
		
//		System.out.println(service.removeVaccineById(1L));
		
		((ConfigurableApplicationContext) context).close();
	}

}
