package Apply;


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
@WebServlet("/ApplicantList")
public class ApplicantList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicantList() {
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

		     Apply user = new Apply();
		     user.setEmployerUsername(request.getParameter("username"));
		    

		     List<Apply> applicantList = ApplicantListDao.applicantResult(user);
			  System.out.println(applicantList);  
		     request.setAttribute("applicantList", applicantList);
		     
		   
		     
			       if((applicantList.size() != 0) == true) {
			    	   RequestDispatcher rd=request.getRequestDispatcher("Hirer/ApplicantSearchResult.jsp");
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
