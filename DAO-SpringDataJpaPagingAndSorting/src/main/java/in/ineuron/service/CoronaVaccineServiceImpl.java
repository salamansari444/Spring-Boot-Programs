package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties) {
		
		Pageable pageable = PageRequest.of(pageNo, pageSize, asc ? Direction.ASC : Direction.DESC, properties);
		Page<CoronaVaccine> page = repo.findAll(pageable);
		return page.getContent();
	}

	
	
}
