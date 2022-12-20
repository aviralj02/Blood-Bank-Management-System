package bbms.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class AdminDonorDelete
 */
public class AdminDonorDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDonorDelete() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			deleteDonor(request, response);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void deleteDonor(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/bbms";
		String user="root";
		String pwd="sqlaviral02";
		
		Connection con=DriverManager.getConnection(url, user, pwd);
		String did=request.getParameter("donor-id");
		String dname=request.getParameter("donor-name");
		PreparedStatement ps=con.prepareStatement("delete from donor where donor_id=? and name=?;");
		ps.setString(1, did);
		ps.setString(2, dname);
		ps.executeUpdate();
		response.sendRedirect("successdelete.jsp");
		ps.close();
		con.close();
	}
}
