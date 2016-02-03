package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("user_name");
		String password = request.getParameter("password");
		System.out.println(userName);
		System.out.println(password);
		
		if(!isAdmin(userName,password)){
			request.getRequestDispatcher("StationHomePage.jsp").forward(request, response);
			
		} else {
			request.getRequestDispatcher("CitizenHomePage.jsp").forward(request, response);
			
		}
	}

	private boolean isAdmin(String userName, String password) {
		return false;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}