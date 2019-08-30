package co.grandcircus.assessment5a;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class GCController {
	
	@RequestMapping("/home")
	public ModelAndView list() {
//		List<Product> listOfProducts = dao.findAll();
		//return new ModelAndView("index", "products", listOfProducts);
		
		//value must match name of JSP
		ModelAndView mav = new ModelAndView("/home");
		
		//key(list) - value(List of Products), pair
//		mav.addObject("Products", listOfProducts);
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
		}
	
	@RequestMapping("/login-submit")
	public ModelAndView loginSubmit(Name name) {
		return new ModelAndView("login-submit");
		
		}

//	@PostMapping("/confirmation-results")
//	public ModelAndView printResults(User name) {
////		userdao.create(name);
//		return new ModelAndView("confirmation-results");
//	}
	

}
