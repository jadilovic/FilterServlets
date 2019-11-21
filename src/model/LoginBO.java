package model;

public class LoginBO {

	// dummy method for user authentication
	public boolean authenticateUser(String username, String password) {

		if ((password == null) || (password.trim() == "") || (username == null) || (username.trim() == "")) {
			return false;
		} else {
			return true;
		}

	}

}