package in.ineuron.service;

import java.util.List;

import org.springframework.data.domain.Page;

import in.ineuron.model.Product;

public interface IProductService {
	public List<Product> findAllProduct();

	public Product insertProduct(Product product);

	public List<Product> getProductWithSort(String field);

	public Page<Product> getProductwithPaging(Integer offSet, Integer pageSize);
	
	public Page<Product> getProductwithPagingAndSorting(Integer offSet, Integer pageSize,String field );

}
