
public class Author {
	
	private String nickname;
	private String email;
	
	
	public Author(String nickname, String email) {
		this.nickname = nickname;
		this.email = email;
	}


	public String getNickname() {
		return nickname;
	}


	public String getEmail() {
		return email;
	}
	
	
	public String getInfo() {
		return "Nick is: " + nickname + ", email is: " + email + ".";
	}


	@Override
	public String toString() {
		return "Author [nickname=" + nickname + ", email=" + email + "]";
	}
	
	
	
	
	

}
