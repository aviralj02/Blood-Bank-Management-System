package bbms.bloodbank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BBPage2
 */
public class BBPage2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BBPage2() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String binput=request.getParameter("bb-input");
		if (binput.equals("add")) {
			response.sendRedirect("addbloodbank.jsp");
		}
		else if(binput.equals("view-list")){
			try {
				viewDonorList(request, response);
			} catch (ClassNotFoundException | SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	static void viewDonorList(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/bbms";
		String user="root";
		String pwd="sqlaviral02";
		
		Connection con=DriverManager.getConnection(url, user,pwd);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from donor;");
		out.println("<html><head><style> *{ background-color: #f7ede2; font-family: sans-serif; } #dtable{ width:100% } table,td,th{ border: 2px solid black; } h1{ margin-left: 40%;}</style>"
				+ "<title>Donor List</title></head><body>"
				+ "<h1>Donor Details</h1><br><br>"
				+ "<table id='dtable'><thead>"
				+ "<th>Donor ID</th>"
				+ "<th>Name</th>"
				+ "<th>Age</th>"
				+ "<th>Blood Group</th>"
				+ "<th>Contact Number</th></thead><tbody>");
		while(rs.next()) {
			String did=rs.getString("donor_id");
			String name=rs.getString("name");
			int age=rs.getInt("age");
			String bg=rs.getString("blood_group");
			String cn=rs.getString("contact");
			out.println("<tr><td>"+did+"</td>"
					+ "<td>"+name+"</td>"
					+ "<td>"+age+"</td>"
					+ "<td>"+bg+"</td>"
					+ "<td>"+cn+"</td></tr>");
		}
		out.println("</tbody></table></body></html>");
		out.close();
		stmt.close();
		con.close();
	}
}
