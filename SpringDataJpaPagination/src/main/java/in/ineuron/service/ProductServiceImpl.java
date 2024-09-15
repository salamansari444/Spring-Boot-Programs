package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IProductDao;
import in.ineuron.model.Product;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductDao repo;

	@Override
	public List<Product> findAllProduct() {
		
		return repo.findAll();
	}

	@Override
	public Product insertProduct(Product product) {
		// TODO Auto-generated method stub
		product.setName("coco cola");
		product.setPrice(20.0);
		product.setQuantity(200);
		return repo.save(product);
	}

	@Override
	public List<Product> getProductWithSort(String field) {
		return repo.findAll(Sort.by(field));
		
	}

	@Override
	public Page<Product> getProductwithPaging(Integer offSet , Integer pageSize) {
		return repo.findAll(PageRequest.of(offSet, pageSize));
	}

	@Override
	public Page<Product> getProductwithPagingAndSorting(Integer offSet, Integer pageSize, String field) {
		// TODO Auto-generated method stub
		
		return  repo.findAll(PageRequest.of(offSet, pageSize).withSort(Sort.by(field)));
		
	}

}
