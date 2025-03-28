package in.sp.backend;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/submit")
public class MyServlet extends HttpServlet {
  protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
	PrintWriter out=res.getWriter();
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	out.println("Welcome, "+name);
	out.println("Your email is : "+email);
  }
}
