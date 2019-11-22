package filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import model.LoginBO;

/**
 * Servlet Filter implementation class FilterServlet
 */
@WebFilter("/home")
public class FilterServlet implements Filter {

    /**
     * Default constructor. 
     */
    public FilterServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("In the Filter Servlet");
		
		PrintWriter out = response.getWriter();
		
		LoginBO test = new LoginBO();
		if(test.authenticateUser(username, password)) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		} else {
			out.println("Username or password are not authentic. Please try again");
			request.getRequestDispatcher("/view/homeLogin.jsp").forward(request, response);
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
