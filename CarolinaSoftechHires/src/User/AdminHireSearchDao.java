package User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AdminHireSearchDao {
	static Connection currentCon = null;
	static ResultSet rs = null;  
	
	
	public static Member hireSearch(Member bean) {
		
		//preparing some objects for connection 
	      Statement stmt = null;
	      
	      String employment_status = bean.getEmployment_status();   
	      String role_status = bean.getRole_status();   
	      String state = bean.getState();    
	      String county = bean.getCounty();    
	      
	      String searchQuery = "SELECT name,username,`employment-status`, `role-status`, phone,state,county,password FROM userdb.membership WHERE `employment-status`= '"+employment_status+"' and`role-status`= '"+ role_status +"' and state = '" + state + "' and county = '" + county + "';";

	      
	      // "System.out.println" prints in the console; Normally used to trace the process
	      System.out.println("Your Employment status name is " + employment_status);          
	      System.out.println("Your Job Title is " + role_status);
	      System.out.println("Your State name is " + state);          
	      System.out.println("Your City is " + county);
	      System.out.println("Query: "+searchQuery);
	      
	      
	      try 
	      {
	         //connect to DB 
	         currentCon = ConnectionManager.getConnection();
	         stmt=currentCon.createStatement();
	         rs = stmt.executeQuery(searchQuery);	        
	         boolean more = rs.next();
	   	       
	        
	         if (more) 
	         {
	        	
	            String name = rs.getString("name");
	            String username = rs.getString("username");
	            employment_status = rs.getString("employment-status");
	            role_status = rs.getString("role-status");
	            String phone = rs.getString("phone");
	            state = rs.getString("state");
	            county = rs.getString("county");
	            String password = rs.getString("password");
	            
	            System.out.println("New Hiree " + name);
	          
	            bean.setName(name);
	            bean.setUsername(username);
	            bean.setEmployment_status(employment_status);
	            bean.setRole_status(role_status);
	            bean.setPhone(phone);
	            bean.setState(state);
	            bean.setCounty(county);
	            bean.setPassword(password);
	            
	            bean.setValid(true);
	         }
	      } 

	      catch (Exception ex) 
	      {
	         System.out.println("Search failed: An Exception has occurred! " + ex);
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
  public static List<Member> hireResult(Member bean) {
		
		//preparing some objects for connection 
	      Statement stmt = null;
	      List<Member> listHires = null;
	      String employment_status = bean.getEmployment_status();   
	      String role_status = bean.getRole_status();   
	      String state = bean.getState();    
	      String county = bean.getCounty();        
	      
	      String searchQuery = "SELECT name,username,`employment-status`, `role-status`, phone,state,county,password FROM userdb.membership WHERE `employment-status`= '"+employment_status+"' and`role-status`= '"+ role_status +"' and state = '" + state + "' and county = '" + county + "';";

	      
	      // "System.out.println" prints in the console; Normally used to trace the process
	      System.out.println("Your Employment status name is " + employment_status);          
	      System.out.println("Your Job Title is " + role_status);
	      System.out.println("Your State name is " + state);          
	      System.out.println("Your City is " + county);
	      System.out.println("Query: "+searchQuery);
	      
	      
	      try 
	      {
	         //connect to DB 
	         currentCon = ConnectionManager.getConnection();
	         stmt=currentCon.createStatement();
	         rs = stmt.executeQuery(searchQuery);
	         listHires = new ArrayList<>();
	        
	   	       
	        
	         while(rs.next()) 
	         {
	        	 	String name = rs.getString("name");
		            String username = rs.getString("username");
		            employment_status = rs.getString("employment-status");
		            role_status = rs.getString("role-status");
		            String phone = rs.getString("phone");
		            state = rs.getString("state");
		            county = rs.getString("county");
		            String password = rs.getString("password");
		            

	            
	            
	            Member member = new Member(name,username, employment_status, role_status, phone, state, county,password);
	            listHires.add(member);
	           
	         }
	      } 

	      catch (Exception ex) 
	      {
	         System.out.println("Search failed: An Exception has occurred! " + ex);
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

	     return listHires;
		
	
	}
	

}
