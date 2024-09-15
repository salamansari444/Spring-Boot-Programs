package in.ineuron.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
	public int fetchEmpsCount();
	public String getEmpNameByNo(int eno);
	public Map<String, Object> empDetailsMap(int  eno);
	public List<Map<String,Object>> getEmpDetailsByDesg(String desg1, String desg2);
	public int insertEmp(String name, int age, String address, String desg, int salary);
	public int addBonus(String desg, int bonus);
}
