package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component(value = "python")
public class PythonCourseMaterial implements ICourse {
	
	
	static {
		System.out.println("PythonCourseMaterial.class file is loading..()");
	}
	public PythonCourseMaterial() {
		System.out.println("PythonCourseMaterial : 0 param constructor");
	}
	

	@Override
	public String courseContent() {
		System.out.println("PythonCourseMaterial.courseContent()");
		return "1:OOPs 2:Flask 3:Indention 4:Datatypes...";
	}

	@Override
	public float price() {
		System.out.println("PythonCourseMaterial.price()");
		return 300;
	}

}
