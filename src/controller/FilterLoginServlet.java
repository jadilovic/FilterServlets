package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginBO;
import model.User;

@WebServlet("/login")
public class FilterLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username, password;

		// get username and password
		username = request.getParameter("username");
		password = request.getParameter("password");

		// authenticate the username and password
		LoginBO login = new LoginBO();
		boolean result = login.authenticateUser(username, password);

		// based on the result, redirect the user
		if (result) {

			User user = new User();
			user.setUsername(username);
			user.setPassword(password);

			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			
			System.out.println("User " + user.getUsername() + " has been logged in");

			RequestDispatcher success = request.getRequestDispatcher("view/success.jsp");
			success.forward(request, response);

		} else {
			
			String error = "Invalid user, plase try again";
			request.setAttribute("error", error);
			
			RequestDispatcher failure = request.getRequestDispatcher("view/login.jsp");
			failure.forward(request, response);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}