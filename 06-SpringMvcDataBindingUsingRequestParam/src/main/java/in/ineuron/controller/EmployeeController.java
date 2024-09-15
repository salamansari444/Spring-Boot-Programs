package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ineuron.model.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/data")
	public String bindData(Map<String, Object> model,
			@RequestParam Integer eno,@RequestParam String ename) 
	{
		System.out.println("EmployeeController.bindData()");
		
		System.out.println("ENO is "+eno);
		System.out.println("ENAME is "+ename);
		return "show_data";
		
	}
	
	//URL ->http://locahost:9999/BindingData/data1?no=10&name=dhoni
	@GetMapping("/data1")
	public String bindData1(Map<String, Object> model,
			@RequestParam("no") Integer eno,@RequestParam("name") String ename) 
	{
		System.out.println("EmployeeController.bindData1()");
		
		System.out.println("ENO is "+eno);
		System.out.println("ENAME is "+ename);
		return "show_data";
		
	}

}
