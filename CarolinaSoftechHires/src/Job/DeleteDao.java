package Job;
import java.sql.*;



public class DeleteDao {
	static Connection currentCon = null;
	static ResultSet rs = null;  
	
	

  public int deleteJob(Job bean) {
		
		//preparing some objects for connection 
	      Statement stmt = null;
	      int id = bean.getId();  
	      String username = bean.getUsername();
	      int result = 0;
//	      Delete jobdb.*,applydb.* from userdb.jobdb,userdb.applydb where jobdb.username = ? AND jobdb.id = ? AND applydb.employerUsername = ? AND applydb.id = ?;
//	      String searchQuery = "Delete FROM userdb.jobdb \n" + 
//	      		"WHERE id = '"+ id +"';";
	      String searchQuery = "Delete jobdb.*,applydb.* from userdb.jobdb,userdb.applydb where jobdb.username = '"+username+"' AND jobdb.id = '"+id+"' OR applydb.employerUsername = '"+username+"' AND applydb.id = '"+id+"';"; 
	      		
	      // "System.out.println" prints in the console; Normally used to trace the process
	      System.out.println("Deleting job listing # " + id);
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
	         System.out.println("Job Search failed: An Exception has occurred! " + ex);
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
