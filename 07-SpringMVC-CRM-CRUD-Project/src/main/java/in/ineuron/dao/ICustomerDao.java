package in.ineuron.dao;

import org.springframework.data.repository.CrudRepository;
import in.ineuron.model.Customer;

public interface ICustomerDao extends CrudRepository<Customer, Integer> {

}
