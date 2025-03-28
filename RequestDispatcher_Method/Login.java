//Q4 : W.A.P to Implement Request Dispatcher  in Servlet where we Implemented an basic login page, if user credentials are correct then redirect the user to profile.jsp page.
//Servlet page to Handle Backend
package in.sp.backend;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login")
public class Login extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		PrintWriter out=res.getWriter();
		if(email.equals("hunter@gmail.com") && pass.equals("hunter123")) {
			req.setAttribute("name_key", "Sudipta kar");
		RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
		rd.forward(req, res);
		}else {
			res.setContentType("text/html");
			out.println("<h3 style='color:red'>Eamil or Password does't match!</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
	}
}
