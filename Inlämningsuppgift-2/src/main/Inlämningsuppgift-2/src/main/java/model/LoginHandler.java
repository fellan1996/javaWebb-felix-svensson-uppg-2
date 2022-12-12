package model;

public class LoginHandler {
	
	public static boolean checkLoginCredentials(String username, String password) {

		if (username.equals("cat") && password.equals("kitten")) {
			return true;
		} else if (username.equals("dog") && password.equals("puppy")) {
			return true;
		}
		return false;
	}
}