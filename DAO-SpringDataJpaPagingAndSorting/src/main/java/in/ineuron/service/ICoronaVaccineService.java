package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineService {
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo, int pageSize,boolean asc, String... properties);
	
}
