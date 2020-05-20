package User;

public class Member {
	private String name,username,employment_status,role_status,phone,state,county,password,rtspassword;
	
	public Member() {
		super();
	}
	public Member(String name,String username,String employment_status,String role_status,String phone,String state,String county, String password, String rtspassword ) {
		super();
		this.name = name;
		this.username = username;
		this.employment_status = employment_status;
		this.role_status = role_status;
		this.phone = phone;
		this.state = state;
		this.county = county;
		this.password = password;
		this.rtspassword = rtspassword;
		
	}
	public Member(String name,String username,String employment_status,String role_status,String phone,String state,String county, String password) {
		super();
		this.name = name;
		this.username = username;
		this.employment_status = employment_status;
		this.role_status = role_status;
		this.phone = phone;
		this.state = state;
		this.county = county;
		this.password = password;
		
	}
	public Member(String name,String employment_status,String role_status,String phone,String state,String county) {
		super();
		this.name = name;
		this.employment_status = employment_status;
		this.role_status = role_status;
		this.phone = phone;
		this.state = state;
		this.county = county;
		
	}
    public boolean valid;

    public boolean isValid() {
        return valid;
	}

     public void setValid(boolean newValid) {
        valid = newValid;
	}	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployment_status() {
		return employment_status;
	}
	public void setEmployment_status(String employment_status) {
		this.employment_status = employment_status;
	}
	public String getRole_status() {
		return role_status;
	}
	public void setRole_status(String role_status) {
		this.role_status = role_status;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRtspassword() {
		return rtspassword;
	}
	public void setRtspassword(String rtspassword) {
		this.rtspassword = rtspassword;
	}
	
}
