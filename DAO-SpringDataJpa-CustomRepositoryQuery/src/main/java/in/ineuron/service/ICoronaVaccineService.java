package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineService {
	public List<CoronaVaccine> fetchVaccineByCompany(String company);
	public List<CoronaVaccine> fetchVaccineByPriceLessThan(Double price);
	public List<CoronaVaccine> getVaccineByCountryInPriceRange(List<String> countries, double startRange, double endRange);

}
