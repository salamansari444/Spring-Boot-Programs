package in.ineuron;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import in.ineuron.service.IEmployeeService;

/**
 * Hello world!
 *
 */
public class JDBCTemplateDirectMethodTest 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
       IEmployeeService empService = context.getBean(IEmployeeService.class);
       System.out.println(empService);
       int recordCount = empService.fetchEmpsCount();
       System.out.println("Count "+recordCount);
       
		try {
			String empNames = empService.getEmpNameByNo(2);
			System.out.println("Emp name is :" + empNames);
			
			Map<String,Object> empMap = empService.empDetailsMap(2);
			System.out.println(empMap);
			
			List<Map<String, Object>> empDetailsByDesg = empService.getEmpDetailsByDesg("captain", "batsman");
			empDetailsByDesg.forEach(System.out::println);
			
			int rowAffected = empService.insertEmp("BAWLA", 25, "MI", "Batsman", 40000);
			System.out.println("ROW Affected is : "+rowAffected);
			
			int addBonus = empService.addBonus("Batsman", 1000);
			System.out.println("update designation : "+addBonus);
			
		} catch (DataAccessException e) {
			System.out.println("Exception message is : " + e.getMessage());
		}
		
		
       
       ((ConfigurableApplicationContext) context).close();
    }
}
