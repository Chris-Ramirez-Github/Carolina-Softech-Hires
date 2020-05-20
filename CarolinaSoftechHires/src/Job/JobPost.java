package Job;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/JobPost")
public class JobPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobPost() {
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
		
		String username = request.getParameter("username");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String job_title = request.getParameter("job-title");
		String job_description = request.getParameter("job-description");
		String employment_time = request.getParameter("employment-time");
		String employment_pay = request.getParameter("employment-pay");
		String employment_amount = request.getParameter("employment-amount");
		String state = request.getParameter("state");
		String county = request.getParameter("county");
		Job job = new Job(username,name,phone,job_title,job_description,employment_time,employment_pay,employment_amount,state,county);
		JobDao rDao = new JobDao();
		int result = rDao.insert(job);	
		response.getWriter().print(result);
		
		if(result == 0) {
				
			String successMessage = "Successfully added job!";
			 response.sendRedirect("Hirer/PostJob.jsp?successMessage="+successMessage); //error page 
		

			
		}
		
		else {
			 String errorMessage = "Error invalid job listing";
	    	 response.sendRedirect("Hirer/error.jsp?errorMessage="+errorMessage); //error page 
			
		}
		
	}


}
