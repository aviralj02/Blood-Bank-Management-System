package bbms.bloodbank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BBPage
 */
public class BBPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BBPage() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			addBloodBank(request, response);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void addBloodBank(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
		PrintWriter out=response.getWriter();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/bbms";
		String user="root";
		String pwd="sqlaviral02";
		
		Connection con=DriverManager.getConnection(url, user, pwd);
		String bbname=request.getParameter("bbname");
		String loc=request.getParameter("loc");
		String cn=request.getParameter("cnumber");
		PreparedStatement ps=con.prepareStatement("insert into bbdetails values(?,?,?);");
		ps.setString(1,bbname);
		ps.setString(2,loc);
		ps.setString(3, cn);
		ps.executeUpdate();
		response.sendRedirect("successbb.jsp");
		out.close();
		ps.close();
		con.close();
	}
}
