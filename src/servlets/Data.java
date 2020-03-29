package servlets;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "data.do", urlPatterns = { "/data.do"})
public class Data extends HttpServlet{

	private static final long serialVersionUID = 1L;

    public Data() {
    	super();
        // TODO Auto-generated constructor stub
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Calendar c = Calendar.getInstance();
    	ServletOutputStream outPut = response.getOutputStream();
		outPut.println("Dia: " + c.get(Calendar.DAY_OF_MONTH) + " Mês: " + 
				c.get(Calendar.MONTH) + " Ano: "+c.get(Calendar.YEAR));

	}
}
