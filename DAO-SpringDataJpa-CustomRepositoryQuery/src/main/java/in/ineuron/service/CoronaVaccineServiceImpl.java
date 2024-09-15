package in.ineuron.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.CrudRepository;
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
		
		List<CoronaVaccine> listEntities = repo.findByCompany(company);
		repo.findByCompanyEquals(company).forEach(System.out::println);
		repo.findByCompanyIs(company).forEach(System.out::println);
		return listEntities;
	}

	@Override
	public List<CoronaVaccine> fetchVaccineByPriceLessThan(Double price) {
		return repo.findByPriceLessThan(price);
	}

	@Override
	public List<CoronaVaccine> getVaccineByCountryInPriceRange(List<String> countries, double startRange,
			double endRange) {
		return repo.findByCountryInAndPriceBetween(countries, startRange, endRange);
	}

	
	

	
	
}
