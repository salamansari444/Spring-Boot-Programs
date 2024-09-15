package in.ineuron.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.type.ResultView;
@Repository
public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long>{
	public List<ResultView> findByPriceGreaterThanEqualOrderByPrice(Double price);
}
