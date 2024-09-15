package in.ineuron.service;

import java.util.Optional;

import in.ineuron.bo.MarriageSeeKer;


public interface IMarriageService {
	public String registerMarriageSeeker(MarriageSeeKer seeker);
	
	public Optional<MarriageSeeKer> searchSeekerById(Long id);
}
