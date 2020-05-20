package User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AdminJobListDao {
	static Connection currentCon = null;
	static ResultSet rs = null;  
	
	

  public static List<Job> jobResult(Job bean) {
		
		//preparing some objects for connection 
	      Statement stmt = null;
	      List<Job> listJobs = null;
	      String job_title = bean.getJob_title();
	      String county = bean.getCounty();
	      String state = bean.getState();
	    		  
	    
	      
	      String searchQuery = "SELECT id, name, phone, `job-title`,`job-description`,`employment-time`,`employment-rate`,`employment-pay`,state,county FROM userdb.jobdb WHERE `job-title`= '"+ job_title +"' and state = '" + state + "' and county = '" + county + "';";

	      
	      // "System.out.println" prints in the console; Normally used to trace the process
	      System.out.println("Job Title is " + job_title);
	      System.out.println("Job City is " + county);
	      System.out.println("Job State is " + state);

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
	        	String name = rs.getString("name");
	        	String phone = rs.getString("phone");
	        	job_title = rs.getString("job-title");
	            String job_description = rs.getString("job-description");
	            String employment_time = rs.getString("employment-time");
	            String employment_pay = rs.getString("employment-rate");
	            String employment_amount = rs.getString("employment-pay");
	            state = rs.getString("state");
	            county = rs.getString("county");
	            
	            
	            Job job = new Job(id,name,phone, job_title, job_description, employment_time, employment_pay,employment_amount, state, county);
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
