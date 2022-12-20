package bbms.donor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DonorPage2
 */
public class DonorPage2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonorPage2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dinput=request.getParameter("donor-input");
		try{
			if(dinput.equals("register")){
				response.sendRedirect("registerdonor.jsp");
			}
			else if(dinput.equals("view-details")){
				viewBBDetails(request, response);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	static void viewBBDetails(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/bbms";
		String user="root";
		String pwd="sqlaviral02";
		
		Connection con=DriverManager.getConnection(url, user,pwd);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from bbdetails;");
		out.println("<html><head><style> *{ background-color: #f7ede2; font-family: sans-serif; } #bbtable{ width:100% } table,td,th{ border: 2px solid black; } h1{ margin-left: 40%;}</style>"
				+ "<title>Blood Bank Details</title></head><body>"
				+ "<h1>Blood Bank Details</h1><br><br>"
				+ "<table id='bbtable'><thead>"
				+ "<th>Blood Bank</th>"
				+ "<th>Location</th>"
				+ "<th>Contact Number</th></thead><tbody>");
		while(rs.next()) {
			String bbname=rs.getString("bbname");
			String loc=rs.getString("location");
			String contact=rs.getString("contact");
			out.println("<tr><td>"+bbname+"</td>"
					+ "<td>"+loc+"</td>"
					+ "<td>"+contact+"</td></tr>");
			
		}
		out.println("</tbody></table></body></html>");
		out.close();
		stmt.close();
		con.close();
	}

}
