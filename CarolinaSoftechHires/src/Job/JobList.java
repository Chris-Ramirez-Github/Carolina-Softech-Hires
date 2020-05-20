package Job;


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
@WebServlet("/JobList")
public class JobList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobList() {
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
		     user.setUsername(request.getParameter("username"));
		    

		     List<Job> jobSearch = JobListDao.jobResult(user);
			  System.out.println(jobSearch);  
		     request.setAttribute("jobSearch", jobSearch);
		     
		   
		     
			       if((jobSearch.size() != 0) == true) {
			    	   RequestDispatcher rd=request.getRequestDispatcher("Hirer/JobSearchResult.jsp");
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
