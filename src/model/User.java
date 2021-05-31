package model;

public class User {
	private String iduser;
	private String name;
	private String password;
	private String role;

	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}

	public User() {
		super();
	}

	public User(String iduser, String name, String password, String role) {
		super();
		this.iduser = iduser;
		this.name = name;
		this.password = password;
		this.role = role;
	}

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
