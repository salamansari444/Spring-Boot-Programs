package in.ineuron;



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

//		CoronaVaccine vaccine = new CoronaVaccine();
//		vaccine.setPrice(598.8);
//		service.searchVaccine(vaccine, true, "price").forEach(System.out::println);
		
		try {
			CoronaVaccine vaccine = service.getVaccineByID(15L);
			if(vaccine!=null) {
				System.out.println("Vaccine Details are : "+vaccine);
			}
			else {
				System.out.println("Record not found");
			}
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) context).close();
	}

}
