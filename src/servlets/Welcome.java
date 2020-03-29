package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Welcome.do", urlPatterns = { "/Welcome.do"})
public class Welcome extends HttpServlet{

	private static final long serialVersionUID = 1L;

    public Welcome() {
    	super();
        // TODO Auto-generated constructor stub
    }
    

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	response.getWriter().print("Servlet sem passar pelo formulário");
    
    }
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	ServletOutputStream outPut = response.getOutputStream();
        String name = request.getParameter("name");
        outPut.println("ola, " + name);
    }
}
