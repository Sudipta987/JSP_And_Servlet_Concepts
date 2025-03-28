//Q1 : W.A.P to create a basic login page using only Servlet.
//Servlet to handle login
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/submit")
public class ImplementationGetPost extends HttpServlet {	
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		if(email.equals("hunter@gmail.com") && pass.equals("hunter123")) {
			out.println("Welcome,"+name);
		}else {
			out.println("Wrong Credentials,Please Enter Correct Password or email!");
		}
	}
}
