package in.ineuron.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagement {
	
	//Syntax:: AS RT packageName.ClassName.methodName(parameter)
	@Pointcut("execution(public void in.ineuron.dao.EmployeeDao.*())")
	public void p1() {}
	
	@Before("operation()")//JoinPoint
	public void beginTransaction() {
		System.out.println("Transaction begin");
	}
	@AfterReturning("operation()")//JoinPoint
	public void commitTransaction() {
		System.out.println("Transaction commit");
	}
	@Pointcut("execution(public void in.ineuron.dao.EmployeeDao.deleteEmployee())")
	public void p2() {}
	
	@Pointcut("p1() || p2()")
	public void operation() {}
	
	@AfterThrowing(value = "p1() || p2()", throwing = "obj")
	public void rollback(Throwable obj) {
		System.out.println(" Transaction RollBack..."+obj.getMessage());
	}
	@After("p1() || p2()")
	public void setup() {
		System.out.println("Setup Done");
	}
}
