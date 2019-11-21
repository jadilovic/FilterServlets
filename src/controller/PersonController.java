package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Person;

@WebServlet("/controller")
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// pokupiti unos korisnika
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String[] enjoy = request.getParameterValues("enjoy");

		// kreirati i populirati person objekt
		Person person = new Person();
		person.setName(name);
		person.setGender(gender);
		person.setEnjoy(enjoy);

		// ubaciti person objekt kao atribut request objekta
		request.setAttribute("person", person);

		// proslijediti request i response objekte viewu
		RequestDispatcher view = request.getRequestDispatcher("view/display.jsp");
		view.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}