package in.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Product;
import in.ineuron.service.IProductService;

@RestController
@RequestMapping("/page")
public class MyController {
	
	@Autowired
	private IProductService service;
	
	@GetMapping("/allProduct")
	private ResponseEntity<List<Product>> getAllproduct(){
		List<Product> allProduct = service.findAllProduct();
		return new ResponseEntity<>(allProduct, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> insertProduct(Product product){
		Product insertProduct = service.insertProduct(product);
		return new ResponseEntity<>(insertProduct, HttpStatus.OK);
	}
	
	@GetMapping("/{field}")
	public ResponseEntity<List<Product>> getProdctWithSort(@PathVariable String field){
		
		List<Product> productWithSort = service.getProductWithSort(field);
		
		return new ResponseEntity<>(productWithSort, HttpStatus.OK);
	}
	
	@GetMapping("/paging/{offset}/{pageSize}")
	public ResponseEntity<Page<Product>> getProductWithPaging(@PathVariable Integer offset,@PathVariable Integer pageSize){
			Page<Product> productwithPaging = service.getProductwithPaging(pageSize, offset);
		return new ResponseEntity<Page<Product>>(productwithPaging, HttpStatus.OK);
	}
	
	@GetMapping("/pagingSorting/{offset}/{pageSize}/{field}")
	public ResponseEntity<Page<Product>> getProductWithPaging(@PathVariable Integer offset,@PathVariable Integer pageSize,@PathVariable String field){
			Page<Product> productwithPagingSorting =  service.getProductwithPagingAndSorting(offset, pageSize, field);
		return new ResponseEntity<Page<Product>>(productwithPagingSorting, HttpStatus.OK);
	}

}
