package in.ineuron.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.MarriageSeeKer;
import in.ineuron.dao.IMarriageDao;

@Service
public class MarriageServiceImpl implements IMarriageService {
	
	@Autowired
	private IMarriageDao repo;

	@Override
	public String registerMarriageSeeker(MarriageSeeKer seeker) {
		
		return "Seeker Data save with the id : "+repo.save(seeker).getId();
	}

	@Override
	public Optional<MarriageSeeKer> searchSeekerById(Long id) {

		return repo.findById(id);
	}
	
	

}
