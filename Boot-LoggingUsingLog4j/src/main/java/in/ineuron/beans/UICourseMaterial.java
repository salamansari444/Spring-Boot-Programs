package in.ineuron.beans;

import org.springframework.stereotype.Component;

@Component(value = "ui")
public class UICourseMaterial implements ICourse {
	
	static {
		System.out.println("UICourseMaterial.class file is loading..()");
	}
	public UICourseMaterial() {
		System.out.println("UICourseMaterial : 0 param constructor");
	}
	

	@Override
	public String courseContent() {
		System.out.println("UICourseMaterial.courseContent()");
		return  "1.HTML 2.CSS 3.JavaScript";
	}

	@Override
	public float price() {
		System.out.println("UICourseMaterial.price()");
		return 450;
	}

}
