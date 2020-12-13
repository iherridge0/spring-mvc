package webapp;

public class LoginService {

	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("irwin") && password.equals("");
	}
	
}
