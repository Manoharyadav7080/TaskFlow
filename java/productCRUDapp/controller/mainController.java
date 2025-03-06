package productCRUDapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productCRUDapp.entities.Product;
import productCRUDapp.service.ProductService;

@Controller
public class mainController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String home(Model model) {
		return productService.home(model);
	}

	@RequestMapping("/add-product")
	public String addproduString(Model model) {
		return productService.addproduString(model);
	}

	// Handle add produc form

	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, Model m, HttpServletRequest request) {
		return productService.handleProduct(product, m, request);

	}

	// Delete Product

	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int id, HttpServletRequest request) {
		return productService.deleteProduct(id, request);

	}

	// Update Form
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId") int pid, Model model) {
		return productService.updateForm(pid, model);
	}
	
	
	//update product 
	@RequestMapping("/update-product")
	public RedirectView updateproduct(@ModelAttribute Product product , Model model , HttpServletRequest request ) {
		return productService.updateproduct(product, model, request);
		
	}
	

}
