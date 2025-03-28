//Q6 : W.A.P to validate user login credentials by performing database validation using JSP.
//Servlet login page that Handles Backend
package in.sp.backend;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/userLogin")
public class UserLogin extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		PrintWriter out=res.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			PreparedStatement psmt=con.prepareStatement("select * from Register where email=? and password=?");
			psmt.setString(1, email);
			psmt.setString(2,pass);
			ResultSet rs=psmt.executeQuery();
		
			if(rs.next()) {
				req.setAttribute("name_key",rs.getString(1));
				req.setAttribute("email", rs.getString(2));
				req.setAttribute("gender", rs.getString(4));
				res.setContentType("text/html");
				out.println("<h3 style='color:aqua'>Login Successful...</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
				rd.include(req, res);
				
			}else {
				res.setContentType("text/html");
				out.println("<h3 style='color:red'>Invalid Email or Password</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
				rd.include(req, res);
			}
			
		}catch(Exception e) {
			res.setContentType("text/html");
			out.println("<h3 style='color:red'>"+e.getMessage()+"</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
			rd.include(req, res);
			
		}
	}
}
