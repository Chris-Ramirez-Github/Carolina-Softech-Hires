package User;
import java.sql.*;


public class LoginDao {
	static Connection currentCon = null;
	static ResultSet rs = null;  
	
	
	public static Member login(Member bean) {
		
		//preparing some objects for connection 
	      Statement stmt = null;
	      
	      String username = bean.getUsername();    
	      String password = bean.getPassword();    
	      String searchQuery = "SELECT name,`employment-status`,`role-status`,phone,state,county From userdb.membership where username='"
	                       + username + "' and password ='" + password + "'";
	     
	      // "System.out.println" prints in the console; Normally used to trace the process
	      System.out.println("Your user name is " + username);          
	      System.out.println("Your password is " + password);
	      System.out.println("Query: "+searchQuery);
	      
	      
	      try 
	      {
	         //connect to DB 
	         currentCon = ConnectionManager.getConnection();
	         stmt=currentCon.createStatement();
	         rs = stmt.executeQuery(searchQuery);	        
	         boolean more = rs.next();
	   	       
	         // if user does not exist set the isValid variable to false
	         if (!more) 
	         {
	            System.out.println("Sorry, you are not a registered user! Please sign up first");
	            bean.setValid(false);
	         } 
	   	        
	         //if user exists set the isValid variable to true
	         else if (more) 
	         {
	            String name = rs.getString("name");
	            String employment_status = rs.getString("employment-status");
	            String role_status = rs.getString("role-status");
	            String phone = rs.getString("phone");
	            String state = rs.getString("state");
	            String county = rs.getString("county");
	            
	            System.out.println("Welcome " + name);
	            bean.setName(name);
	            bean.setEmployment_status(employment_status);
	            bean.setRole_status(role_status);
	            bean.setPhone(phone);
	            bean.setState(state);
	            bean.setCounty(county);
	            
	            bean.setValid(true);
	         }
	      } 

	      catch (Exception ex) 
	      {
	         System.out.println("Log In failed: An Exception has occurred! " + ex);
	      } 
	   	    
	      //some exception handling
	      finally 
	      {
	         if (rs != null)	{
	            try {
	               rs.close();
	            } catch (Exception e) {}
	               rs = null;
	            }
	   	
	         if (stmt != null) {
	            try {
	               stmt.close();
	            } catch (Exception e) {}
	               stmt = null;
	            }
	   	
	         if (currentCon != null) {
	            try {
	               currentCon.close();
	            } catch (Exception e) {
	            }

	            currentCon = null;
	         }
	      }

	      
	
		return bean;
		
	
	}
	

}
