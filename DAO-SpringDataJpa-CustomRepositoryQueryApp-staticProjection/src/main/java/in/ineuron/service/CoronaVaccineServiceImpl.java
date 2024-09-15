package in.ineuron.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.ICoronaVaccineRepo;
import in.ineuron.type.ResultView;

@Service(value = "service")
public  class CoronaVaccineServiceImpl implements ICoronaVaccineService {
	
	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public List<ResultView> searchVaccineByStartPrice(Double price) {
		 List<ResultView> findByPriceGreaterThanEqualOrderByPrice = repo.findByPriceGreaterThanEqualOrderByPrice(price);
		 return findByPriceGreaterThanEqualOrderByPrice;
	}

	

	
	

	
	
}
