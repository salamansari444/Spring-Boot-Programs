package in.ineuron.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ineuron.bo.CoronaVaccine;
import in.ineuron.dao.ICoronaVaccineRepo;
import in.ineuron.type.View;

@Service(value = "service")
public  class CoronaVaccineServiceImpl implements ICoronaVaccineService {
	
	@Autowired
	private ICoronaVaccineRepo repo;
	@Override
	public <T extends View> List<T> getVaccineByCompany(String company, Class<T> clazz) {
		
		List<T> list = repo.findByCompanyOrderByCompanyDesc(company, clazz);
		return list;
	}

	

	
	

	
	
}
