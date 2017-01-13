import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String uname=request.getParameter("uname");
	String passwd=request.getParameter("passwd");
	model.LoginCredential ob=new model.LoginCredential();
	ob.setUname(uname);
	ob.setPasswd(passwd);
	
	if(ob.CheckLogin())
	{
		RequestDispatcher dispatch=request.getRequestDispatcher("Success");
		dispatch.forward(request,response);
	}
	else
	{
		RequestDispatcher dispatch=request.getRequestDispatcher("Failure");
		dispatch.forward(request,response);
	}
	}

}
