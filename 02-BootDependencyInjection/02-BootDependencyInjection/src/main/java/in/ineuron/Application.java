package in.ineuron;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Student;

@SpringBootApplication
public class Application {
	static {
		System.out.println("Application.class file is loading()");
	}
	public Application() {
		System.out.println("Application.:: 0 param constructor ()");
	}
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Beans id is : "+Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println("Beans count is : "+context.getBeanDefinitionCount());
		
		
		Student student = context.getBean(Student.class);
		System.out.println(student);
		student.prepration("Java");
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
