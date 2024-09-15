package in.ineuron.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.StudentBo;

@Repository(value = "studentDao")
public class StudentDaoImpl implements IStudentDao {
	
	private static final String SQL_SELECT_DETAILS_BY_NO = "select sid,sname, sage,saddress from student where sid=?";
	private static final String SQL_STUDENT_DETAILS_BY_NAME = "select sid, sname, sage,saddress from student where sname in(?,?)";
	private static final String SQL_STUDENT_DETAILS_BY_CITY = "select sid, sname, sage,saddress from student where saddress in(?,?,?)";;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public StudentBo getStudentbyNo(int no) {
		StudentBo bo=null;
		bo=jdbcTemplate.queryForObject(SQL_SELECT_DETAILS_BY_NO,new StudentMapper(), no);
		return bo;
	}
	
	private static class StudentMapper implements RowMapper<StudentBo>{

		@Override
		public StudentBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("StudentDaoImpl.StudentMapper.mapRow()");
			
			StudentBo bo=new StudentBo();
			bo.setSid(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setSage(rs.getInt(3));
			bo.setSaddress(rs.getString(4));
			
			
			return bo;
		}
		
	}

	@Override
	public List<StudentBo> getStudentByName(String name1, String name2) {
		
		return jdbcTemplate.query(SQL_STUDENT_DETAILS_BY_NAME, new StudentRowMapper(), name1, name2);
	}
	
	private static class StudentRowMapper implements RowMapper<StudentBo>{

		@Override
		public StudentBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("StudentDaoImpl.StudentRowMapper.mapRow()");
			StudentBo bo =null;
			bo=new StudentBo();
			bo.setSid(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setSage(rs.getInt(3));
			bo.setSaddress(rs.getString(4));
			return bo;
		}
		
	}

	@Override
	public List<StudentBo> getStudentByCity(String city1, String city2, String city3) {
		
		return jdbcTemplate.query(SQL_STUDENT_DETAILS_BY_CITY, new ResultSetExtractor<List<StudentBo>>() {

			@Override
			public List<StudentBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<StudentBo> listBo=null;
						listBo=new ArrayList<StudentBo>(); 
				StudentBo stdBo=null;
				while(rs.next()) {
					stdBo=new StudentBo();
					stdBo.setSid(rs.getInt(1));
					stdBo.setSname(rs.getString(2));
					stdBo.setSage(rs.getInt(3));
					stdBo.setSaddress(rs.getString(4));
					
					listBo.add(stdBo);
				}
				return listBo;
			}
			
		}, city1, city2, city3);
	}
	
	
}
