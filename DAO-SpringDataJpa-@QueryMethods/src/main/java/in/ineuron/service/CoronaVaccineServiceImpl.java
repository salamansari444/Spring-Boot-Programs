package in.ineuron.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.dao.ICoronaVaccineRepo;

@Service(value = "service")
public  class CoronaVaccineServiceImpl implements ICoronaVaccineService {
	
	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public List<CoronaVaccine> fetchVaccineByCompany(String company) {
		System.out.println(repo.getClass() + " " + Arrays.toString(repo.getClass().getDeclaredMethods()));
		
		List<CoronaVaccine> listEntities = repo.findVaccineByCompany(company);
		
		return listEntities;
	}

	

	
	

	
	
}
