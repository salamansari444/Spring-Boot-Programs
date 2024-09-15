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
	@Pointcut("@annotation(in.ineuron.annotation.MyTransaction)")
	public void p1() {}
	
	@Before("p1()")//JoinPoint
	public void beginTransaction() {
		System.out.println("---------------Transaction begin-------------");
	}
	
	@After("p1() ")
	public void setup() {
		System.out.println("---------------After Transaction-------------");
	}
}
