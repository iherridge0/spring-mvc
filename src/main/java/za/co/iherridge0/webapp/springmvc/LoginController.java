package za.co.iherridge0.webapp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	@ResponseBody
	public String sayHello() {
		return "Hello World";
	}
	
}
