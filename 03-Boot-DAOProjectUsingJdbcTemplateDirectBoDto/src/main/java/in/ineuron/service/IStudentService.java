package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.StudentBo;
import in.ineuron.dto.StudentDto;

public interface IStudentService {
	public StudentDto fetchStudentByNo(int no);
	public List<StudentDto> getStudentByName(String name1, String name2);
	public List<StudentDto> fetchStudentByCity(String city1, String city2, String city3);


}
