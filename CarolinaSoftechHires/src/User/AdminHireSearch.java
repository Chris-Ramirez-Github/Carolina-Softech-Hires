package User;
 import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/AdminHireSearch")
public class AdminHireSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHireSearch() {
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
		     user.setEmployment_status(request.getParameter("employment-status"));
		     user.setRole_status(request.getParameter("role-status"));
		     user.setState(request.getParameter("state"));
		     user.setCounty(request.getParameter("county"));

		     List<Member> hireSearch = AdminHireSearchDao.hireResult(user);
			  System.out.println(hireSearch);  
		     request.setAttribute("hireSearch", hireSearch);
			       
			    if((hireSearch.size() != 0) == true){   
		     	
			    	   RequestDispatcher rd=request.getRequestDispatcher("Admin/SearchResult.jsp");
			    	    rd.forward(request,response);
					       
			      
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
		
		

	



