package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IStudentDao;
import in.ineuron.dto.StudentDto;

@Service(value = "stdService")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao dao;
	
	public StudentServiceImpl(IStudentDao dao) {
		System.out.println("StudentServiceImpl. constructor called");
		this.dao = dao;
	}

	
	@Override
	public String toString() {
		return "StudentServiceImpl [dao=" + dao + "]";
	}


	@Override
	public int insert(StudentDto s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(StudentDto s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(StudentDto s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StudentDto getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
