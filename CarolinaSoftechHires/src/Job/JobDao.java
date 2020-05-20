package Job;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JobDao {
	
	private String dburl = "jdbc:mysql://localhost:3306/userdb";
	private String dbusername= "root";
	private String dbpassword = "13b874B4!";
	private String dbdriver = "com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver) 
	{
		try {
		Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public Connection getConnection() 
	{
		Connection con = null;
		try {
			con=DriverManager.getConnection(dburl,dbusername,dbpassword);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return con; 
	}
	public int insert(Job job) {
		loadDriver(dbdriver);
		Connection con=getConnection();
		int result = 0;
		String sql = "Insert into userdb.jobdb(username,name,phone,`job-title`,`job-description`,`employment-time`,`employment-rate`,`employment-pay`,state,county) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, job.getUsername());
			ps.setString(2, job.getName());
			ps.setString(3, job.getPhone());
			ps.setString(4, job.getJob_title());
			ps.setString(5, job.getJob_description());
			ps.setString(6, job.getEmployment_time());
			ps.setString(7, job.getEmployment_pay());
			ps.setString(8, job.getEmployment_amount());
			ps.setString(9, job.getState());
			ps.setString(10, job.getCounty());
			ps.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
			result = 1;
		}
		return result;
		
	}
	
	

}
