package in.ineuron.service;

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
	public List<CoronaVaccine> searchVaccine(CoronaVaccine vaccine, boolean ascOrder, String properties) {
		
		System.out.println("Proxy class is : "+repo.getClass().getName());
		
		Example<CoronaVaccine> example = Example.of(vaccine);
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, properties);
		List<CoronaVaccine> listEntities = repo.findAll(example, sort);
		return listEntities;
	}

	@Override
	public CoronaVaccine getVaccineByID(Long regNo) {
		CoronaVaccine vaccine = repo.getReferenceById(regNo);
		return vaccine;
	}

	

	
	
}
