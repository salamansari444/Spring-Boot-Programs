package in.ineuron;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.IEmployeeService;

@SpringBootApplication
public class BootProjDaoUsingJdbcTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProjDaoUsingJdbcTemplateApplication.class, args);
		
		IEmployeeService service = context.getBean(IEmployeeService.class);
		List<Map<String, Object>> empDetailsByDesg = service.getEmpDetailsByDesg("bowler","allRounder");
		empDetailsByDesg.forEach(System.out::println);
		
		((ConfigurableApplicationContext) context).close();
		
		
		
		
	}

}
