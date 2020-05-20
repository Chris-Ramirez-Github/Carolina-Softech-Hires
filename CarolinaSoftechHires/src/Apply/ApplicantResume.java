package Apply;
 
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class GetDetails
 */
@WebServlet("/ApplicantResume")
public class ApplicantResume extends HttpServlet {
    private static final long serialVersionUID = 1L;
        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicantResume() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
        String username = request.getParameter("employeeUsername")!=null?request.getParameter("employeeUsername"):"NA";
        String resumeTitle = request.getParameter("resumeTitle")!=null?request.getParameter("resumeTitle"):"NA";
        String fileType = request.getParameter("fileType")!=null?request.getParameter("fileType"):"NA";
         
        ServletOutputStream sos;
        Connection  con=null;
        PreparedStatement pstmt=null;
        
        if(fileType.equals("0")) {
        response.setContentType("application/pdf");

        response.setHeader("Content-disposition","inline; filename="+resumeTitle+"_"+username+"_resume.pdf" );
        }
        if(fileType.equals("1")) {
            response.setContentType("application/msword");
     
            response.setHeader("Content-disposition","inline; filename="+resumeTitle+"_"+username+"_resume.doc" );
            }
 
         sos = response.getOutputStream();
         
 
           try {
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","13b874B4!");
          } catch (Exception e) {
                     System.out.println(e);
                     System.exit(0); 
                          }
            
          ResultSet rset=null;
            try {
                pstmt = con.prepareStatement("SELECT fileContent FROM userdb.applydb WHERE employeeUsername=? and resumeTitle =?");
                pstmt.setString(1, username);
                pstmt.setString(2, resumeTitle);
                rset = pstmt.executeQuery();
                if (rset.next())
                    sos.write(rset.getBytes("fileContent"));
                else
                    return;
                 
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
     
        sos.flush();
        sos.close();
         
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
 
}