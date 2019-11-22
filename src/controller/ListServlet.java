package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;

@WebServlet("/contacts")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// create an array list to hold contacts
		ArrayList<Contact> contacts = new ArrayList<>();

		// create new contacts
		Contact contact = new Contact("John", "Doe", "555-1337", "221B Baker Street");
		Contact contact2 = new Contact("Jane", "Doe", "666-1337", "Wes Craven Avenue");

		// add new contacts to the arraylist
		contacts.add(contact);
		contacts.add(contact2);

		// move on
		request.getSession().setAttribute("contacts", contacts);
		response.sendRedirect("view/contacts.jsp");
		//request.getSession().setAttribute("contacts", contacts);
		//request.getRequestDispatcher("view/contacts.jsp").forward(request, response);
	}
}
