package User;
import java.sql.*;



public class DeleteUserDao {
	static Connection currentCon = null;
	static ResultSet rs = null;  
	
	

  public int deleteUser(Member user) {
		
		//preparing some objects for connection 
	      Statement stmt = null;
	      String username = user.getUsername();   
	      int result = 0;
	      
	      String searchQuery = "Delete FROM userdb.membership WHERE username = '"+ username +"';";

	      
	      // "System.out.println" prints in the console; Normally used to trace the process
	      System.out.println("Deleting user account # " + username);
	      System.out.println("Query: "+searchQuery);
	      
	      
	      try 
	      {
	         //connect to DB 
	         currentCon = ConnectionManager.getConnection();
	         stmt=currentCon.createStatement();
	         stmt.executeUpdate(searchQuery);
	         
	      } 

	      catch (Exception ex) 
	      {
	         System.out.println("Delete User Account failed: An Exception has occurred! " + ex);
	         result = 1;
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
	      return result;
	}
	

}
