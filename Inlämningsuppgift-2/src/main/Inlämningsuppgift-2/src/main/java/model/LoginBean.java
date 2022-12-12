package model;

public class LoginBean {

		private String username ="";
		private String password ="";
		
		public String getPassword() {
			return password;
		}
		public String getUsername() {
			return username;
		}

		public void setUsernameAndPassword(String username, String password) {
			this.username = username;
			this.password = password;
		}

		public boolean checkIfCredentialsAreCorrect() {
			return LoginHandler.checkLoginCredentials(username, password);
		}

}

