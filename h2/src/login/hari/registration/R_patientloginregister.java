package login.hari.registration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class R_patientloginregister
 */
@WebServlet("/R_patientloginregister")
public class R_patientloginregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public R_patientloginregister() {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		PatientDAO d=new PatientDAOImpl();
		
		
		String userName=request.getParameter("username");
		String password=request.getParameter("password1");
		String submittype=request.getParameter("submit");
		Patient d1=d.getPatient(userName,password);
		 if(submittype.equals("register"))
		{
			d1.setName(request.getParameter("name"));
			d1.setPassword(password);
			d1.setUsername(userName);
			d.insertPatient(d1);
			request.setAttribute("sumessege","register r_success");
			request.getRequestDispatcher("r_patientlogin.jsp").forward(request, response);

		}
		else
		{
			request.setAttribute("messege","r_please register");
			request.getRequestDispatcher("r_patientlogin.jsp").forward(request, response);
		}
}
}