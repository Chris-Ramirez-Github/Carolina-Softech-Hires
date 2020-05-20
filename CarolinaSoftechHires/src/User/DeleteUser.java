package User;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/DeleteUser")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try
		{	    

		     Member user = new Member();
		     user.setUsername(request.getParameter("username"));
		     
		     DeleteUserDao delete = new DeleteUserDao();
		     int result = delete.deleteUser(user);
		     
		     if(result == 0) {
		    	 
		    	 String message = "User Successfully Deleted!";
		    	 response.sendRedirect("Admin/AdminProfile.jsp?message="+ message); 
		     }
		     else {
		    	 String errorMessage = "Sorry, no result in your query.";
		    	 response.sendRedirect("Admin/error.jsp?errorMessage="+errorMessage); //error page 
		     }
		       
		     
		} 
				
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		       }

}
