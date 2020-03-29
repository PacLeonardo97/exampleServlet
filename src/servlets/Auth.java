package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Autenticacao.do", urlPatterns = { "/Autenticacao.do" })
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Auth() {
        super();
    }
    
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	response.getWriter().print("Servlet sem passar pelo formulário");
    
    }
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
 
        String usuario= request.getParameter("email");
        String senha = request.getParameter("senha");
        
        if (usuario.equals("joao@teste.com.br") && senha.equals("13579")) {
            response.getWriter().print("Conta acessada com sucesso");
        }
        else if(usuario.equals("") || senha.equals("")) {
        	response.getWriter().print("Nao se esqueça de preencher todos os campos");
        }
        else {
        	response.getWriter().print("Dados incorretos");
        	
        }
    }
}