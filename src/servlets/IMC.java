package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "imc.do", urlPatterns = { "/imc.do"})
public class IMC extends HttpServlet{

	private static final long serialVersionUID = 1L;

    public IMC() {
    	super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	response.getWriter().print("Servlet sem passar pelo formulário");
    
    }
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	ServletOutputStream outPut = response.getOutputStream();
        String peso = request.getParameter("peso");
        String altura = request.getParameter("altura");
        double imc = Math.floor(Double.parseDouble(peso) / (Double.parseDouble(altura) * Double.parseDouble(altura)));
	    
        outPut.println("seu imc é: " + imc);
        outPut.println("<br />");
        
        if(imc < 18.5) {
        	outPut.println("Abaixo do peso");
        } else if(imc > 18.5 && imc < 24.9) {
        	outPut.println("Peso normal");
        } else if(imc > 25 && imc < 29.9) {
        	outPut.println("Sobrepeso");
        } else if(imc > 30 && imc < 34.9) {
        	outPut.println("Obesidade grau 1");
        } else if(imc > 30 && imc < 34.9) {
        	outPut.println("Obesidade grau 2");
        } else {
        	outPut.println("Obesidade grau 3");
        }
    }
}
