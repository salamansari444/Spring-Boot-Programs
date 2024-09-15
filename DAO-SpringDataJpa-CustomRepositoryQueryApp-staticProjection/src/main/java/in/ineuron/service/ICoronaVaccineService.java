package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.type.ResultView;

public interface ICoronaVaccineService {
	public List<ResultView> searchVaccineByStartPrice(Double price);


}
