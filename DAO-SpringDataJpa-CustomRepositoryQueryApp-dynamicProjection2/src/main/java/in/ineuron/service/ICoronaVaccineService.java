package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.type.ResultView1;
import in.ineuron.type.View;

public interface ICoronaVaccineService {
	public <T extends View> List<T> getVaccineByCompany(String company, Class<T> clazz);


}
