package pyramid1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amazon.cart1.dao.CategoryDAO;
@Controller("dispatcher")
public class MyController {
	@Autowired
	
	CategoryDAO categoryDAO;
	//if you want to navigate to other page without carrying the data
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv= new ModelAndView("Home");
		mv.addObject("message","hello");
		
		return mv;
		//GET all the categories along with products
	}
	
	//if you want to navigate to other page with carrying the data
	//SPA:Single Page Application
/*	@RequestMapping("/Register")
	public ModelAndView register()
	{
		ModelAndView mv= new ModelAndView("Home");
		mv.addObject("message","thankyou");
		
		return mv;
	}
*/	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv= new ModelAndView("login");
		mv.addObject("message","Welcome");
		
		return mv;
	}
	@RequestMapping("/signup")
	public ModelAndView signUp()
	{
		ModelAndView mv= new ModelAndView("signup");
		mv.addObject("message","thankyou");
		
		return mv;
	}
}
