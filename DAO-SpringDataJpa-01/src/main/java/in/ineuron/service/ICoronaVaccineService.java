package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineService {
	public String register(CoronaVaccine vaccine);
	public Long getVaccineCount();
	public boolean checkVaccineExist(Long d);
	public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccines);
	public Iterable<CoronaVaccine> fetchAllDetails();
	public Iterable<CoronaVaccine> fetchById(Iterable<Long> ids);
	
	public String removeVaccineById(Long id);
	public String removeVaccineByObject(CoronaVaccine vacine);
	public String removeVaccinesById(List<Long> ids);
	
}
