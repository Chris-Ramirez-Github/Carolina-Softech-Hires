package User;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String employment_status = request.getParameter("employment-status");
		String role_status = request.getParameter("role-status");
		String phone = request.getParameter("phone");
		String state = request.getParameter("state");
		String county = request.getParameter("county");
		String password = request.getParameter("password");
		String rtspassword = request.getParameter("rtspassword");
		Member member = new Member(name,username,employment_status,role_status,phone,state,county,password,rtspassword);
		RegisterDao rDao = new RegisterDao();
		int result = rDao.insert(member);	
//		response.getWriter().print(result);
		if(result == 0) {
			if((employment_status.equals("0")) == true) {
				response.sendRedirect("Hirer/HireProfile.jsp?name=" + name + "&username=" + username 
						+ "&employment-status=" + employment_status + "&role-status=" + role_status
						+ "&phone=" + phone + "&state=" + state + "&county=" + county);
		        

			}
			else{
				response.sendRedirect("Hiree/HireeProfile.jsp?name=" + name + "&username=" + username 
						+ "&employment-status=" + employment_status + "&role-status=" + role_status
						+ "&phone=" + phone + "&state=" + state + "&county=" + county);
		        
			}
		}
		
		else {
			
			response.sendRedirect("error.jsp");
		}
		
	}


}
