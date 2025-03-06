package productCRUDapp.Dao;

import java.util.List;

import productCRUDapp.entities.Product;

public interface ProductDao {
	
	public void createProduct( Product product);
	public List<Product>  getProducts();
	public void deleteProduct(int pid) ;
	public Product getProduct(int pid);
	public void updateProduct(Product product);
	
	
	
	 
}
