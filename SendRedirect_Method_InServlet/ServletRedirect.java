//Q3 : W.A.P to Implement the Send Redirect Method in Servlet for Searching anythin on Google.
//Servlet Page to Handle Backend
package in.sp.backend;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/search")
public class ServletRedirect extends HttpServlet {
		protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException{
			String search=req.getParameter("search1");
			res.sendRedirect("https://www.google.com/search?q="+search);
		}
}
