package in.ineuron.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CoronaVaccine implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long regNo;
	private String name;
	private String company;
	private String country;
	private Double price;
	private Integer requriedDoseCount;
	
	public CoronaVaccine() {
		System.out.println("Hibernate Internally uses Zero param Constructor for select operation");
	}
	public CoronaVaccine(Long regNo, String name, String company, String country, Double price,
			Integer requriedDoseCount) {
		
		this.regNo = regNo;
		this.name = name;
		this.company = company;
		this.country = country;
		this.price = price;
		this.requriedDoseCount = requriedDoseCount;
	}
	@Override
	public String toString() {
		return "CoronaVaccine [regNo=" + regNo + ", name=" + name + ", company=" + company + ", country=" + country
				+ ", price=" + price + ", requriedDoseCount=" + requriedDoseCount + "]";
	}
	public Long getRegNo() {
		return regNo;
	}

	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getRequriedDoseCount() {
		return requriedDoseCount;
	}

	public void setRequriedDoseCount(Integer requriedDoseCount) {
		this.requriedDoseCount = requriedDoseCount;
	}

}
