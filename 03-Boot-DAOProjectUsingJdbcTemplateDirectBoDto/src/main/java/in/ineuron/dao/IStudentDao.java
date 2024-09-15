package in.ineuron.dao;

import java.util.List;

import in.ineuron.bo.StudentBo;

public interface IStudentDao {
	public StudentBo getStudentbyNo(int no);
	public List<StudentBo> getStudentByName(String name1, String name2);
	public List<StudentBo> getStudentByCity(String city1, String city2, String city3);
}
