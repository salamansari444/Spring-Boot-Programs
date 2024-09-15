package in.ineuron.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;


public class EmployeeDaoImpl implements IEmployeeDao {
	
	private static final String SQL_SELECT_QUERY = "select Count(*) from employees";
	private static final String SQL_SELECT_QUERY_NAME_BY_NO = "select name from employees where id=? ";
	private static final String SQL_SELECT_QUERY_NAME_BY_DESG = "select name from employees where desg in(?) ";
	private static final String SELECT_QUERY_FOR_MAP_BY_NO = "select id, name, age, address, desg, salary from employees where id=?";
	private static final String SQL_SELECT_QUERY_LISTNAME_BY_DESG = "select id, name, age, address, desg, salary from employees where desg in(?,?) order by salary";
	private static final String SQL_UPDATE_INSERT_EMP = "insert into employees (`name`,`age`,`address`,`desg`,`salary`) values(?,?,?,?,?)";
	private static final String SQL_UPDATE_ADDBONUS = "update employees set salary=salary+? where desg=?";
	
	
	private JdbcTemplate jdbcTemplate;
	
	
	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int fetchEmpsCount() {
		System.out.println("class  is "+jdbcTemplate);	
		return jdbcTemplate.queryForObject(SQL_SELECT_QUERY, Integer.class);
	}


	@Override
	public String toString() {
		return "EmployeeDaoImpl [template=" + jdbcTemplate + "]";
	}


	@Override
	public String getEmpNameByNo(int eno) {
		
		return jdbcTemplate.queryForObject(SQL_SELECT_QUERY_NAME_BY_NO, String.class,eno);
	}


	@Override
	public Map<String, Object> empDetailsMap(int eno) {
		Map<String, Object> map = jdbcTemplate.queryForMap(SELECT_QUERY_FOR_MAP_BY_NO , eno);
		return map;
	}


	@Override
	public List<Map<String, Object>> getEmpDetailsByDesg(String desg1, String desg2) {
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(SQL_SELECT_QUERY_LISTNAME_BY_DESG, desg1, desg2);
		return queryForList;
	}


	@Override
	public int insertEmp(String name, int age, String address, String desg, int salary) {
		int updateEmp = jdbcTemplate.update(SQL_UPDATE_INSERT_EMP, name,age,address,desg,salary);
		return updateEmp;
	}


	@Override
	public int addBonus(String desg, int bonus) {
		int updateBonus = jdbcTemplate.update(SQL_UPDATE_ADDBONUS, bonus,desg);
		return updateBonus;
	}
	
	

}
