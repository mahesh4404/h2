package login.hari.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

@WebServlet("/r_show")
public class r_show extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public r_show() {
		super();
	}

	public void service(HttpServletRequest request, HttpServletResponse response) {
	String r_docid = request.getParameter("r_doc_id");
		String r_patid = request.getParameter("r_pat_id");
		String r_hs = request.getParameter("r_hss");

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harisarvo", "root", "hari");
			Statement st = con.createStatement();
			int x = 0;

			PrintWriter out = response.getWriter();

			out.print("<html><body><table>");

			ResultSet rs = st.executeQuery("SELECT * FROM  Patient");
			out.print("<html><body><table>");

			while (rs.next()) {

				if (rs.getString(2).equals(r_patid)) {

					x = 1;
					out.print("<tr><td>");
					out.printf("patient status is :" + rs.getString(3));
					out.print("<tr><td>");
					break;
				}
			}
			out.print("</table></body></html>");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

/*
 * if(x==1) { String ha="";
 * 
 * try {
 * 
 * ResultSet r=st.executeQuery("SELECT pat_id FROM  Patient"); while(r.next()) {
 * if(r.getString(2).equals(r_patid)) {
 * 
 * 
 * } } //String har="select r_hs from patient where pat_id=' "+r_patid+" '"; //
 * ha=st.executeQuery("select r_hs from patient where pat_id=' "+r_patid+" '").
 * toString(); }catch(Exception e) {} //System.out.println(har);
 * out.println("harisarvothama");
 * 
 * 
 * } else { }
 */
