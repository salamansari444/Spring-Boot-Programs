package in.ineuron.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "java")
@Primary
public class JavaCourseMaterial implements ICourse {
	
	
	static {
		System.out.println("JavaCourseMaterial.class file is loading..()");
	}
	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial : 0 param constructor");
	}
	

	@Override
	public String courseContent() {
		System.out.println("JavaCourseMaterial.courseContent()");
		return "1:OOPs 2:Collection 3:Exception 4:MultiThreading...";
	}

	@Override
	public float price() {
		System.out.println("JavaCourseMaterial.price()");
		return 500;
	}

}
