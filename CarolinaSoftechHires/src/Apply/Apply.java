package Apply;

public class Apply {
	private String employerUsername, employeeUsername, name, jobTitle, 
	phone, county, state, resumeTitle, fileType, fileContent;
	private int id; 
	
	public Apply() {
		super();
	}
	public Apply(int id, String employerUsername, String employeeUsername,  String name, String jobTitle, 
			String phone, String county, String state, String resumeTitle, String fileType,  String fileContent) {
		super();
		this.id = id;
		this.employerUsername = employerUsername;
		this.employeeUsername = employeeUsername;
		this.name = name;
		this.jobTitle = jobTitle;
		this.phone = phone;
		this.county = county;
		this.state = state;
		this.resumeTitle = resumeTitle;
		this.fileType = fileType;
		this.fileContent = fileContent;
		
	}
	public Apply(int id, String employeeUsername,  String name, String jobTitle, 
			String phone, String county, String state, String resumeTitle, String fileType) {
		super();
		this.id = id;
		this.employeeUsername = employeeUsername;
		this.name = name;
		this.jobTitle = jobTitle;
		this.phone = phone;
		this.county = county;
		this.state = state;
		this.resumeTitle = resumeTitle;
		this.fileType = fileType;
		
	}
	public Apply(int id, String employerUsername) {
		super();
		this.id = id;
		this.employerUsername = employerUsername;
		
	}


	public String getEmployerUsername() {
		return employerUsername;
	}

	public void setEmployerUsername(String employerUsername) {
		this.employerUsername = employerUsername;
	}

	public String getEmployeeUsername() {
		return employeeUsername;
	}

	public void setEmployeeUsername(String employeeUsername) {
		this.employeeUsername = employeeUsername;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getResumeTitle() {
		return resumeTitle;
	}

	public void setResumeTitle(String resumeTitle) {
		this.resumeTitle = resumeTitle;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
