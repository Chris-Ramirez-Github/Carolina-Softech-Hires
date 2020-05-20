package Job;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JobListDao {
	static Connection currentCon = null;
	static ResultSet rs = null;  
	
	

  public static List<Job> jobResult(Job bean) {
		
		//preparing some objects for connection 
	      Statement stmt = null;
	      List<Job> listJobs = null;
	      String username = bean.getUsername();   
	    
	      
	      String searchQuery = "SELECT id, username, name, phone, `job-title`,`job-description`,`employment-time`,`employment-rate`,`employment-pay`,state,county FROM userdb.jobdb \n" + 
	      		"WHERE username = '"+ username +"';";

	      
	      // "System.out.println" prints in the console; Normally used to trace the process
	      System.out.println("Username is " + username);
	      System.out.println("Query: "+searchQuery);
	      
	      
	      try 
	      {
	         //connect to DB 
	         currentCon = ConnectionManager.getConnection();
	         stmt=currentCon.createStatement();
	         rs = stmt.executeQuery(searchQuery);
	         listJobs = new ArrayList<>();
	        
	   	       
	        
	         while(rs.next()) 
	         {
	        	int id = rs.getInt("id");
	        	username = rs.getString("username");
	        	String name = rs.getString("name");
	        	String phone = rs.getString("phone");
	        	String job_title = rs.getString("job-title");
	            String job_description = rs.getString("job-description");
	            String employment_time = rs.getString("employment-time");
	            String employment_pay = rs.getString("employment-rate");
	            String employment_amount = rs.getString("employment-pay");
	            String state = rs.getString("state");
	            String county = rs.getString("county");
	            
	            
	            Job job = new Job(id,username,name,phone, job_title, job_description, employment_time, employment_pay,employment_amount, state, county);
	            listJobs.add(job);
	           
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

	     return listJobs;
		
	
	}
	

}
