package Apply;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class ApplyJobSubmit
 */
@WebServlet("/ApplyJobSubmit")
@MultipartConfig
public class ApplyJobSubmit extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
		    

		    
		     int id = Integer.parseInt(request.getParameter("id"));
		     String employerUsername = request.getParameter("employerUsername");
		     String employeeUsername = request.getParameter("employeeUsername");
		     String name = request.getParameter("name");
		     String jobTitle = request.getParameter("jobTitle");
		     String phone = request.getParameter("phone");
		     String county = request.getParameter("county");
		     String state = request.getParameter("state");
		     String resumeTitle = request.getParameter("resumeTitle");
		     String fileType = request.getParameter("fileType");
		     final Part filePart = request.getPart("file");
		     
		     
		     InputStream pdfFileBytes = null;
		        final PrintWriter writer = response.getWriter();
		        
		        try {
		        	 
		            if ((!filePart.getContentType().equals("application/pdf"))&&(!filePart.getContentType().equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document"))&&(!filePart.getContentType().equals("application/msword")))
		              {
		                         //writer.println("<br/> Invalid File");
		                         String message = "Warning: Invalid Application submission";
		            	    	 	response.sendRedirect("Hiree/HireeProfile.jsp?message="+ message); 
		                         return;
		              }
		   
		             else if (filePart.getSize()>1048576 ) { //2mb
		                 {
		                //writer.println("<br/> File size too big");
		              	String message = "Warning: File size too big";
		  	    	 	response.sendRedirect("Hiree/HireeProfile.jsp?message="+ message); 
		                return;
		                 }
		             }
		   
		              pdfFileBytes = filePart.getInputStream();  // to get the body of the request as binary data
		   
		              final byte[] bytes = new byte[pdfFileBytes.available()];
		               pdfFileBytes.read(bytes);  //Storing the binary data in bytes array.
		   
		              Connection  con=null;
		   
		                 try {
		                       Class.forName("com.mysql.jdbc.Driver");
		                       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","13b874B4!");
		                    } catch (Exception e) {
		                          System.out.println(e);
		                          System.exit(0);
		                                }
		   

		                  int success=0;
		                  PreparedStatement pstmt = con.prepareStatement("INSERT INTO userdb.applydb VALUES(?,?,?,?,?,?,?,?,?,?,?)");
		                  pstmt.setInt(1, id);
		                  pstmt.setString(2, employerUsername);
		                  pstmt.setString(3, employeeUsername);
		                  pstmt.setString(4, name);
		                  pstmt.setString(5, jobTitle);
		                  pstmt.setString(6, phone);
		                  pstmt.setString(7, county);
		                  pstmt.setString(8, state);
		                  pstmt.setString(9, resumeTitle);
		                  pstmt.setString(10, fileType);
		                  pstmt.setBytes(11,bytes);    //Storing binary data in blob field.
		                  success = pstmt.executeUpdate();
		                  System.out.println(success);
		                  if(success>=1)  System.out.println("Job Application submitted!");
		                  
		                   con.close(); 
		                   
		                  
		                   String message = "Job application sent Successfully!";
		  		    	 response.sendRedirect("Hiree/HireeProfile.jsp?message="+ message); 
		   
		          } catch (FileNotFoundException fnf) {
//		              writer.println("You  did not specify a file to upload");
		              String message = "Job application not sent";
		  	    	 response.sendRedirect("Hiree/HireeProfile.jsp?message="+ message); 
//		              writer.println("<br/> ERROR: " + fnf.getMessage());
		   
		          } catch (SQLException e) {
		              // TODO Auto-generated catch block
		              e.printStackTrace();
		          } finally {
		   
		              if (pdfFileBytes != null) {
		                  pdfFileBytes.close();
		              }
		              if (writer != null) {
		                  writer.close();
		              }
		          }
		     
//		   
		     }
		       
		     
		 
				
				

	}


