package User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterDao {
	
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
	public int insert(Member member) {
		loadDriver(dbdriver);
		Connection con=getConnection();
		int result = 0;
		String sql = "Insert into userdb.membership values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getUsername());
			ps.setString(3, member.getEmployment_status());
			ps.setString(4, member.getRole_status());
			ps.setString(5, member.getPhone());
			ps.setString(6, member.getState());
			ps.setString(7, member.getCounty());
			ps.setString(8, member.getPassword());
			ps.setString(9, member.getRtspassword());
			ps.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
			result = 1;
		}
		return result;
		
	}
	

}
