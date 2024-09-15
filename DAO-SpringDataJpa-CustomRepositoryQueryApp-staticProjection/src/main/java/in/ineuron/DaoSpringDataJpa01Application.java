package in.ineuron;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.service.ICoronaVaccineService;
import in.ineuron.type.ResultView;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpa01Application.class, args);
		ICoronaVaccineService service = context.getBean(ICoronaVaccineService.class);

		List<ResultView> listVaccines = service.searchVaccineByStartPrice(450.0);
		listVaccines.forEach(vaccine -> {
			System.out.println(
					vaccine.getClass().getName() + " " + Arrays.toString(vaccine.getClass().getDeclaredMethods()));
			System.out.println(vaccine.getName() + " " + vaccine.getCountry());
		});
		((ConfigurableApplicationContext) context).close();
	}

}
