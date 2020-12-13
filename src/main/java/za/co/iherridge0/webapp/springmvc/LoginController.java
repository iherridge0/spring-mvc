package za.co.iherridge0.webapp.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import za.co.iherridge0.webapp.LoginService;

/**
 * Spring MVC
 * 
 * DispatcherServlet -> Front Controller
 * 
 * returns "login" which resolves to view login.jsp
 * 
 * /login -> LoginController (Handler)
 * Hello World
 * 
 * View Resolver
 * login -> /WEB-INF/views/login.jsp
 * 
 * login.jsp -> view
 * 
 * /WEB-INF/views/login.jsp
 * 
 */

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	// @ResponseBody -> login would be shown on the screen, we don't want that, we ant to go to login.jsp, hence login on return
	public String sayHello() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String name,
			@RequestParam String password) {
		model.put("name", name);
		model.put("password", password);
		
		boolean isValidUser = service.validateUser(name, password);

		if (isValidUser) {
			return "welcome";
		} else {
			model.put("errorMessage", "Invalid Credentials!!");
			return "login";
		}
	}
	
}
