package in.ineuron.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import in.ineuron.service.IStudentService;

@Controller
public class MainApp {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IStudentService service = context.getBean(IStudentService.class);
		System.out.println(service);
		
		((AbstractApplicationContext) context).close();
	}
}
