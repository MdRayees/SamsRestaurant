package SamsRestaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SamsRestaurant.controller.model.OrderOnline;



@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	/*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}
	*/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println("Home Page Requested");
		return "home";
	}
	
	
// example code from author
	
	/*   
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
	
	*/
	
	@RequestMapping(value = "/orderOnline", method = RequestMethod.GET)
	public String orderOnline(@Validated OrderOnline order,Model model) {
		System.out.println("order page Requested");
		model.addAttribute("name",order.getName());
		model.addAttribute("phoneNumber",order.getPhoneNumber());
		model.addAttribute("comments",order.getComments());
		return "orderOnline";
	}
	
	@RequestMapping(value = "/orderPlaced", method = RequestMethod.GET)
	public String orderSummary(@Validated OrderOnline order,Model model) {
		System.out.println("order page Requested");
		model.addAttribute("name",order.getName());
		model.addAttribute("phoneNumber",order.getPhoneNumber());
		model.addAttribute("comments",order.getComments());
		return "orderPlaced";
	}
	
	
	// partially working
	/*
	@RequestMapping(value = "/orderOnline", method = RequestMethod.GET)
	public ModelAndView orderOnline() {
		System.out.println("orderOnline page Requested");
		ModelAndView model1 = new ModelAndView("orderOnline");
		
		return model1;
	}
	
	@RequestMapping(value = "/orderOnlineSummary", method = RequestMethod.POST)
	public ModelAndView orderOnlineSummary(@RequestParam ("name") String name, @RequestParam("phoneNumber") Integer phoneNumber, @RequestParam("comments") String comments) {
		System.out.println("summary page Requested");
		ModelAndView model1 = new ModelAndView("OrderPlaced");
		model1.addObject( "Name:" + name + "Phone Number :" + phoneNumber + "comments : "+ comments);
		return model1;
	}
		
		*/
		
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact() {
		System.out.println("contact Page Requested");
		return "contact";
	}
}

