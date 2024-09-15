package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.StudentBo;
import in.ineuron.dao.IStudentDao;
import in.ineuron.dto.StudentDto;

@Service(value = "studentService")
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao dao;

	@Override
	public StudentDto fetchStudentByNo(int no) {
		System.out.println("StudentServiceImpl.fetchStudentByNo()");
		StudentDto dto=new StudentDto();
		StudentBo bo = dao.getStudentbyNo(no);
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public List<StudentDto> getStudentByName(String name1, String name2) {
		List<StudentBo> studentBo = dao.getStudentByName(name1, name2);
		List<StudentDto> studentDto=new ArrayList<StudentDto>();
		studentBo.forEach(bo->{
			StudentDto dto=new StudentDto();
			BeanUtils.copyProperties(bo, dto);
			studentDto.add(dto);
		});
		return studentDto;
	}

	@Override
	public List<StudentDto> fetchStudentByCity(String city1, String city2, String city3) {
		List<StudentBo> boStudent = dao.getStudentByCity(city1, city2, city3);
		List<StudentDto> dtoStu=new ArrayList<StudentDto>();
		boStudent.forEach(bo ->{
			StudentDto dto=new StudentDto();
			BeanUtils.copyProperties(bo, dto);
			dtoStu.add(dto);
		});
		return dtoStu;
	}

}
