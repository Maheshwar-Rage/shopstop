

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletServlet
 */
@WebServlet("/ServletServlet")
public class ServletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Server Servlet</title></head>");
		out.print("<body bgcolor=\"#ffffff\">");
		out.print("<h1>Request methods</h1>");
		out.print("<b>Remote Host:</b>"+request.getRemoteHost()+"<br/>");
		out.print("<b>Remote Port:</b>"+request.getRemotePort()+"<br/>");
		out.print("<b>Requested URI:</b>"+request.getRequestURI()+"<br/>");
		out.print("<b>Server Name:</b>"+request.getServerName()+"<br/>");
		out.print("<b>Server Port:</b>"+request.getServerPort()+"<br/>");
		out.print("</body>");
		out.print("</html>");
		out.close();





		






		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
