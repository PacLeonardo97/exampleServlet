package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "tabuada.do", urlPatterns = { "/tabuada.do"})

public class Tabuada extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Tabuada() {
    	super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream outPut = response.getOutputStream();
		
		for(int number = 1; number < 10; number++) {
			for (int i = 1; i < 10; i++) {
				outPut.println( number + " x " + i + " = " + number * i + "<br />");
			}
			outPut.println("<br />");
		}
	}
}
