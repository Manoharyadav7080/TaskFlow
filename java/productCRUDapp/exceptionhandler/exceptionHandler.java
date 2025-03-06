package productCRUDapp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class exceptionHandler {
	
	// this handlar handle all type Exception because is  a main class of Exception 
		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value = Exception.class)
		public String exceptionHandlerGenric(Model model ) {	
			model.addAttribute("masg" , "Exception has occoure , Genric Exception has occour ");
			return "null_page";
			
		}
		

}
