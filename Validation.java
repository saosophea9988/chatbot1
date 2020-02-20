import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.function.DoubleBinaryOperator;

@WebServlet(name = "Validation")
public class Validation extends HttpServlet {
    PreparedStatement ps;
    Connection con = null;
    Statement st;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       int sno =  Integer.parseInt(request.getParameter("sno"));
//       String name = request.getParameter("firsname");
//       Student student = new Student();
        PrintWriter out = response.getWriter();
//
//       student.setSno(sno);
//       student.setFirstname(name);
//
//       DatabaseConnection oper = new DatabaseConnection();
//        try {
//            if(oper.insertReconrd(student)){
//                out.println("Registeration seccess...");
//            }
//            else{
//                out.println("something wrong");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("j  dbc:mysql://localhost:3306/kit","root","");
            st=con.createStatement();
            st.executeUpdate("INSERT INTO student(sno,sname) values(1,'sophea')");
        } catch (Exception e) {
            out.println("Something wrong");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}