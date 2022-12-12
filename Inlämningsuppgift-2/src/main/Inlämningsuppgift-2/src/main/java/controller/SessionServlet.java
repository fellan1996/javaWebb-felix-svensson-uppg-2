package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.LoginBean;
import java.io.IOException;
@WebServlet("/SessionServlett")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SessionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("views/profile.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		LoginBean catOrDog = new LoginBean();
		catOrDog.setUsernameAndPassword(request.getParameter("username"), request.getParameter("password"));

		if(catOrDog.checkIfCredentialsAreCorrect()){

			HttpSession httpSession = request.getSession();
			// adds name and data into the session
			httpSession.setAttribute("isLoggedIn", catOrDog);
		}

		RequestDispatcher rd = request.getRequestDispatcher("views/profile.jsp");
		rd.forward(request, response);
	}

}
