package User;

public class Job {
	private String username,name,phone,job_title,job_description,employment_time,employment_pay,employment_amount,state,county;
	private int id;
	public Job() {
		super();
	}
	public Job(String username,String name,String phone, String job_title,String job_description, String employment_time,String employment_pay,String employment_amount, String state, String county ) {
		super();
	
		this.username = username;
		this.name = name;
		this.phone = phone;
		this.job_title = job_title;
		this.job_description = job_description;
		this.employment_time = employment_time;
		this.employment_pay = employment_pay;
		this.employment_amount = employment_amount;
		this.state = state;
		this.county = county;
		
	}
	
	public Job(String job_title, String state, String county ) {
		super();
		this.job_title = job_title;
		this.state = state;
		this.county = county;
		
	}
	public Job(int id, String name,String phone, String job_title,String job_description, String employment_time,String employment_pay,String employment_amount, String state, String county ) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.job_title = job_title;
		this.job_description = job_description;
		this.employment_time = employment_time;
		this.employment_pay = employment_pay;
		this.employment_amount = employment_amount;
		this.state = state;
		this.county = county;
		
	}
	public Job(int id,String username, String name,String phone, String job_title,String job_description, String employment_time,String employment_pay,String employment_amount, String state, String county ) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.phone = phone;
		this.job_title = job_title;
		this.job_description = job_description;
		this.employment_time = employment_time;
		this.employment_pay = employment_pay;
		this.employment_amount = employment_amount;
		this.state = state;
		this.county = county;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public String getEmployment_time() {
		return employment_time;
	}
	public void setEmployment_time(String employment_time) {
		this.employment_time = employment_time;
	}
	public String getEmployment_pay() {
		return employment_pay;
	}
	public void setEmployment_pay(String employment_pay) {
		this.employment_pay = employment_pay;
	}
	public String getEmployment_amount() {
		return employment_amount;
	}
	public void setEmployment_amount(String employment_amount) {
		this.employment_amount = employment_amount;
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
	
	
}
