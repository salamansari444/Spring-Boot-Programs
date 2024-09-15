package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineService {
	public List<CoronaVaccine> searchVaccine(CoronaVaccine vaccine,boolean ascOrder, String properties);
	public CoronaVaccine getVaccineByID(Long regNo);
}
