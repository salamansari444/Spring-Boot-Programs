package in.ineuron.dto;

import java.io.Serializable;

public class StudentDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Integer sid;
	private String sname;
	private String saddress;
	private Integer sage;

	private String grade;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentDto [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sage=" + sage + ", grade="
				+ grade + "]";
	}

}