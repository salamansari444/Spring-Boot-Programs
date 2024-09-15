package in.ineuron.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.StudentBo;

@Repository(value = "stdDao")
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
		System.out.println("StudentDaoImpl. constructor called one param");
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public String toString() {
		return "StudentDaoImpl [hibernateTemplate=" + hibernateTemplate + "]";
	}

	@Override
	public int insert(StudentBo s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(StudentBo s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(StudentBo s) {
		// TODO Auto-generated method stub

	}

	@Override
	public StudentBo getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentBo> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
