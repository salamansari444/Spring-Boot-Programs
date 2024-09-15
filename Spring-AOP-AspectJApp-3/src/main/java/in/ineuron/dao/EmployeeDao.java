package in.ineuron.dao;

import org.springframework.stereotype.Component;

import in.ineuron.annotation.MyTransaction;

@Component
public class EmployeeDao {
	@MyTransaction
	public void saveEmployee() {
		System.out.println("employee object is saved...");
	}
	public void deleteEmployee() {
		System.out.println("employee object is deleted...");
	}
	public void getEmployee() {
		System.out.println("employee object is Retrieved...");
	}
}
