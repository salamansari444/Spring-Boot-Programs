package in.ineuron.service;


import java.util.List;
import java.util.Map;

import in.ineuron.dao.IEmployeeDao;

public class EmployeeServiceImpl implements IEmployeeService {
	
	private IEmployeeDao dao;
	
	
	public EmployeeServiceImpl(IEmployeeDao dao) {
		this.dao = dao;
	}


	@Override
	public int fetchEmpsCount() {
		System.out.println("Implementing class is : "+dao.getClass().getName());
		return dao.fetchEmpsCount();
	}

	@Override
	public String getEmpNameByNo(int eno) {
		
		return dao.getEmpNameByNo(eno);
	}


	@Override
	public Map<String, Object> empDetailsMap(int eno) {
		Map<String, Object> mapno = dao.empDetailsMap(eno);
		return mapno;
	}


	@Override
	public List<Map<String, Object>> getEmpDetailsByDesg(String desg1, String desg2) {
		List<Map<String, Object>> empDetailsByDesg = dao.getEmpDetailsByDesg(desg1, desg2);
		return empDetailsByDesg;
	}


	@Override
	public int insertEmp(String name, int age, String address, String desg, int salary) {
		int insertEmp = dao.insertEmp(name, age, address, desg, salary);
		return insertEmp;
	}


	@Override
	public int addBonus(String desg, int bonus) {
		int addBonus = dao.addBonus(desg, bonus);
		return addBonus;
	}


	
}
