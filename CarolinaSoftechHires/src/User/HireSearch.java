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
@WebServlet("/HireSearch")
public class HireSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HireSearch() {
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
		     user.setEmployment_status(request.getParameter("employment-status"));
		     user.setRole_status(request.getParameter("role-status"));
		     user.setState(request.getParameter("state"));
		     user.setCounty(request.getParameter("county"));

		     List<Member> hireSearch = HireSearchDao.hireResult(user);
			  System.out.println(hireSearch);  
		     request.setAttribute("hireSearch", hireSearch);
			       
			    if((hireSearch.size() != 0) == true){   
		     	if((user.getEmployment_status().equals("0")) == true) {
			    	   RequestDispatcher rd=request.getRequestDispatcher("Hiree/SearchResult.jsp");
			    	    rd.forward(request,response);
//				          HttpSession session = request.getSession(true);	    
//				          session.setAttribute("currentSessionUser",user); 
//				        
//				          response.sendRedirect("Hiree/SearchResult.jsp?name=" + user.getName() + "&username=" + user.getUsername() 
//									+ "&employment-status=" + user.getEmployment_status() + "&role-status=" + user.getRole_status()
//									+ "&phone=" + user.getPhone() + "&state=" + user.getState() + "&county=" + user.getCounty()); 	
					       }
			       if((user.getEmployment_status().equals("1")) == true) {
			    	   RequestDispatcher rd=request.getRequestDispatcher("Hirer/SearchResult.jsp");
			    	    rd.forward(request,response);
//				          HttpSession session = request.getSession(true);	    
//				          session.setAttribute("currentSessionUser",user); 
//				        
//				          response.sendRedirect("Hirer/SearchResult.jsp?name=" + user.getName()
//									+ "&employment-status=" + user.getEmployment_status() + "&role-status=" + user.getRole_status()
//									+ "&phone=" + user.getPhone() + "&state=" + user.getState() + "&county=" + user.getCounty()); 	
					       }
			    } 
			    else {
		    	 String errorMessage = "Sorry, no result in your query.";
		    	 response.sendRedirect("error.jsp?errorMessage="+errorMessage); //error page 
			       		   }
		} 
				
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
		       }
			
			
			
		}
		
		

	



