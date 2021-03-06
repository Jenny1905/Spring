package c2tc.batch.product;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository repo;
	public List<Product> listAll() 
	{
		return repo.findAll();
	}
	public Product get(Integer id) {
		
		return repo.findById(id).get();
	}
	public void save(Product product) {
		repo.save(product);
		
	}
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

}
