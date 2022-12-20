package bbms.donor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DonorPage
 */
public class DonorPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonorPage() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			registerDonor(request, response);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	static void registerDonor(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		Random r=new Random();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/bbms";
		String user="root";
		String pwd="sqlaviral02";
		
		Connection con=DriverManager.getConnection(url, user,pwd);
		String did="do"+ Integer.toString(r.nextInt(10000));
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String bg=request.getParameter("bg");
		String cn=request.getParameter("number");
		
		String query="insert into donor values(?,?,?,?,?);";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, did);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setString(4, bg);
		ps.setString(5, cn);
		ps.executeUpdate();
		response.sendRedirect("successdonor.jsp");
		ps.close();
		con.close();
		out.close();
	}

}
