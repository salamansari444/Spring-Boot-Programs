package in.ineuron;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.dto.StudentDto;
import in.ineuron.service.IStudentService;



@SpringBootApplication
public class BootProjDaoUsingJdbcTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProjDaoUsingJdbcTemplateApplication.class, args);
		
		IStudentService service = context.getBean(IStudentService.class);
//		System.out.println(service.fetchStudentByNo(1));
		
		List<StudentDto> list= service.getStudentByName("sachin", "iyer");
		list.forEach(System.out::println);
		
		List<StudentDto> fetchStudentByCity = service.fetchStudentByCity("csk", "kkr", "rcb");
		System.out.println("City Name");
		fetchStudentByCity.forEach(System.out::println);
		((ConfigurableApplicationContext) context).close();
		
		
		
		
	}

}
