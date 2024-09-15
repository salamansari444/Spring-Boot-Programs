package in.ineuron.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long>{
	
	@Query("from CoronaVaccine where company=:comp")
	public List<CoronaVaccine> findVaccineByCompany(@Param("comp") String company);

	}
