//Q5 : W.A.P to register or Sign Up a user in a Oracle database using JSP.
//Servlet Page for Handling Backend Processing.
package in.sp.backend;
import java.sql.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import java.sql.DriverManager;

@WebServlet("/regForm")
public class Register extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("pass");
		String gender=req.getParameter("gender");
		PrintWriter out=res.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			
			PreparedStatement psmt=con.prepareStatement("insert into Register values(?,?,?,?)");
			psmt.setString(1, name);
			psmt.setString(2, email);
			psmt.setString(3, password);
			psmt.setString(4,gender);
			int count=psmt.executeUpdate();
			if(count>0) {
				req.setAttribute("name_key",name);
				res.setContentType("text/html");
				out.println("<h3 style='color:aqua'>User Registered Successfully...</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/welcome.jsp");
				rd.include(req,res);
			}else {
				res.setContentType("text/html");
				out.println("<h3 style='color:red'>User Registration Failed Due to some error...</h3>");
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
