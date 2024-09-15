package in.ineuron.service;

import java.util.List;
import in.ineuron.dto.StudentDto;

public interface IStudentService {
	public int insert(StudentDto s);

	public void delete(int id);

	public void delete(StudentDto s);

	public void update(StudentDto s);

	public StudentDto getStudent(int id);

	public List<StudentDto> getAllStudents();
}
