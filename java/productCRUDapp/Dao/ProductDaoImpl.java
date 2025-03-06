package productCRUDapp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import productCRUDapp.entities.Product;


@Component
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// Create Opration
	@Override
	@Transactional // Create .
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		 Integer id =(Integer) this.hibernateTemplate.save(product);
		System.out.println("Product saved where id : " + id);
	}
	

	// get all product
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		List<Product> products = this.hibernateTemplate.loadAll(Product.class); // kis class ka object hame loade karna
																				// hai to product class ka.
		return products;
	}

	// delete product by id
	@Transactional
	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);

	}

	// get a single product by id
	@Override
	public Product getProduct(int pid) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Product.class, pid);
	}
	
	@Override
	@Transactional
//	Update only 
	public void updateProduct(Product product) {
		this.hibernateTemplate.update( product);
		System.out.println("Update Successfully....");
	}

}
