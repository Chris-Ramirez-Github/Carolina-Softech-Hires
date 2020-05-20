package User;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JobList
 */
@WebServlet("/AdminJobList")
public class AdminJobList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminJobList() {
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

		     Job user = new Job();
		     user.setJob_title(request.getParameter("job_title"));
		     user.setCounty(request.getParameter("county"));
		     user.setState(request.getParameter("state"));
		    

		     List<Job> jobSearch = AdminJobListDao.jobResult(user);
			  System.out.println(jobSearch);  
		     request.setAttribute("jobSearch", jobSearch);
		     
		   
		     
			       if((jobSearch.size() != 0) == true) {
			    	   RequestDispatcher rd=request.getRequestDispatcher("Admin/JobSearchResult.jsp");
			    	    rd.forward(request,response);
					       }
		     
			       else {
		    	 String errorMessage = "Sorry, no result in your query.";
		    	 response.sendRedirect("Hirer/error.jsp?errorMessage="+errorMessage); //error page 
			       		   }
		} 
				
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
		       }
			

}
