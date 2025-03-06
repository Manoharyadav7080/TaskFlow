 package productCRUDapp.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.view.RedirectView;

import productCRUDapp.Dao.ProductDao;
import productCRUDapp.entities.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	// home page
	public String home(Model model) {
		List<Product> products = productDao.getProducts();
		model.addAttribute("products", products);
		System.out.println("Home page requesting.....");
		return "index";
	}

	// Add product form
	public String addproduString(Model model) {
		System.out.println("Add product page Requesting...");
		model.addAttribute("title", "Add Product");
		model.addAttribute("title" ,"addProductForm");
		return "add_product_from";
	}

	public RedirectView handleProduct(Product product, Model m, HttpServletRequest request){
		System.out.println(product); // print all information help to the toString methods
		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/"); // for redirect a home page
		return redirectView;

	}

	// delete handler
	public RedirectView deleteProduct(int id, HttpServletRequest request) {
		this.productDao.deleteProduct(id);
		System.out.println("product deleted where id :" + id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/"); // for redirect a home page
		return redirectView;
	}

	// update Form
	public String updateForm(int pid, Model model) {
		System.out.println("Update Product page rqquesting by user where id :" + pid);
		Product product = this.productDao.getProduct(pid);
		model.addAttribute("product", product);
		model.addAttribute("title" , "update_Form");
		return "update_form";
	}

	// update product
	public RedirectView updateproduct(Product product, Model model, HttpServletRequest request) {
		System.out.println(product);
		productDao.updateProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/"); // for redirect a home page
		return redirectView;
	}

}
