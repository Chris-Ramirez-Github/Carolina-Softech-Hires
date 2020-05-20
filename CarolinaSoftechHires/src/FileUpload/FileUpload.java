package FileUpload;


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
 
@WebServlet("/FileUpload")
@MultipartConfig
public class FileUpload extends HttpServlet {
 
    /**
     *
     */
    private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request,  HttpServletResponse response)       throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
 
        final Part filePart = request.getPart("file");
        String resumeTitle = request.getParameter("resumeTitle");
        String fileType = request.getParameter("fileType");
        String username = request.getParameter("username");
 
        InputStream pdfFileBytes = null;
        final PrintWriter writer = response.getWriter();
 
        try {
 
          if ((!filePart.getContentType().equals("application/pdf"))&&(!filePart.getContentType().equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document"))&&(!filePart.getContentType().equals("application/msword")))
            {
                       //writer.println("<br/> Invalid File");
                       String message = "Warning: Invalid File";
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
                PreparedStatement pstmt = con.prepareStatement("INSERT INTO userdb.resumedb VALUES(?,?,?,?)");
                pstmt.setString(1, username);
                pstmt.setString(2, resumeTitle);
                pstmt.setString(3, fileType);
                pstmt.setBytes(4,bytes);    //Storing binary data in blob field.
                success = pstmt.executeUpdate();
                System.out.println(success);
                if(success>=1)  System.out.println("Resume Stored");
                
                 con.close(); 
                 
                
                 String message = "Resume Successfully Stored!";
		    	 response.sendRedirect("Hiree/HireeProfile.jsp?message="+ message); 
 
        } catch (FileNotFoundException fnf) {
//            writer.println("You  did not specify a file to upload");
            String message = "You  did not specify a file to upload";
	    	 response.sendRedirect("Hiree/HireeProfile.jsp?message="+ message); 
//            writer.println("<br/> ERROR: " + fnf.getMessage());
 
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
 
    }
 
}