package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	static {
		System.out.println("Student.class file is loading..()");
	}
	public Student() {
		System.out.println("Student.Student() : 0 param constructor");
	}
	
	@Autowired(required = true)
	private ICourse course;
	
	public void prepration(String examName) {
		System.out.println("Student.prepration()");
		System.out.println("Implementing class is : "+examName.getClass().getName());
		
		
		String courseContent=course.courseContent();
		float coursePrice=course.price();
		
		System.out.println("Preparation is going on using " + courseContent + " material with price ::" + coursePrice);
		System.out.println("Preparation completed for ::" + examName);
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	
}
