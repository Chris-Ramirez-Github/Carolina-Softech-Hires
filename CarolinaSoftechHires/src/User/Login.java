package User;
 import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		try
		{	    

		     Member user = new Member();
		     user.setUsername(request.getParameter("username"));
		     user.setPassword(request.getParameter("password"));

		     user = LoginDao.login(user);
			   		    
		     if (user.isValid())
		     {
			       if((user.getEmployment_status().equals("0")) == true) {
		          HttpSession session = request.getSession(true);	    
		          session.setAttribute("currentSessionUser",user); 
		        
		          response.sendRedirect("Hirer/HireProfile.jsp?name=" + user.getName() + "&username=" + user.getUsername() 
							+ "&employment-status=" + user.getEmployment_status() + "&role-status=" + user.getRole_status()
							+ "&phone=" + user.getPhone() + "&state=" + user.getState() + "&county=" + user.getCounty()); 	
			       }
			       else if((user.getEmployment_status().equals("1")) == true) {
				          HttpSession session = request.getSession(true);	    
				          session.setAttribute("currentSessionUser",user); 
				        
				          response.sendRedirect("Hiree/HireeProfile.jsp?name=" + user.getName() + "&username=" + user.getUsername() 
									+ "&employment-status=" + user.getEmployment_status() + "&role-status=" + user.getRole_status()
									+ "&phone=" + user.getPhone() + "&state=" + user.getState() + "&county=" + user.getCounty()); 	
					       }
			       else if((user.getEmployment_status().equals("2")) == true) {
				          HttpSession session = request.getSession(true);	    
				          session.setAttribute("currentSessionUser",user); 
				        
				          response.sendRedirect("Admin/AdminProfile.jsp?name=" + user.getName() + "&username=" + user.getUsername() 
									+ "&employment-status=" + user.getEmployment_status() + "&role-status=" + user.getRole_status()
									+ "&phone=" + user.getPhone() + "&state=" + user.getState() + "&county=" + user.getCounty()); 	
					       }
		     }
			        
		     else {

		    	 String errorMessage = "Error invalid login credentials";
		    	 response.sendRedirect("error.jsp?errorMessage="+errorMessage); //error page 
		     }
		} 
				
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
		       }
			
			
			
		}
		
		

	



