package Apply;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ApplicantListDao {
	static Connection currentCon = null;
	static ResultSet rs = null;  
	
	

  public static List<Apply> applicantResult(Apply bean) {
		
		//preparing some objects for connection 
	      Statement stmt = null;
	      List<Apply> listApplicants = null;
	      String username = bean.getEmployerUsername();   
	    
	      
	      String searchQuery = "SELECT id, employeeUsername, name, jobTitle, phone, state, county, resumeTitle, fileType FROM userdb.applydb \n" + 
	      		"WHERE employerUsername = '"+ username +"';";

	      
	      // "System.out.println" prints in the console; Normally used to trace the process
	      System.out.println("Username is " + username);
	      System.out.println("Query: "+searchQuery);
	      
	      
	      try 
	      {
	         //connect to DB 
	         currentCon = ConnectionManager.getConnection();
	         stmt=currentCon.createStatement();
	         rs = stmt.executeQuery(searchQuery);
	         listApplicants = new ArrayList<>();
	        
	   	       
	        
	         while(rs.next()) 
	         {
	        	int id = rs.getInt("id");
	        	String employeeUsername = rs.getString("employeeUsername");
	        	String name = rs.getString("name");
	        	String jobTitle = rs.getString("jobTitle");
	        	String phone = rs.getString("phone");
	            String county = rs.getString("county");
	            String state = rs.getString("state");
	            String resumeTitle = rs.getString("resumeTitle");
	            String fileType = rs.getString("fileType");
	            
	            
	            
	            
	            Apply user = new Apply(id, employeeUsername, name, jobTitle, phone, county, state, resumeTitle, fileType);
	            listApplicants.add(user);
	           
	         }
	      } 

	      catch (Exception ex) 
	      {
	         System.out.println("Job Search failed: An Exception has occurred! " + ex);
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

	     return listApplicants;
		
	
	}
	

}
