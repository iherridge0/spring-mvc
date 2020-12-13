package za.co.iherridge0.webapp;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("irwin") && password.equals("");
	}
	
}
