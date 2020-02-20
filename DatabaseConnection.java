import java.sql.*;

public class DatabaseConnection {
    PreparedStatement ps;
    Connection con = null;
    public Connection getCon() throws ClassNotFoundException, SQLException {
        if(con == null) {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc.mysql://localhost:3306/kit", "root", "");
        }
        return con;
    }
    public boolean insertReconrd(Student s) throws SQLException, ClassNotFoundException {
        con  =getCon();
         ps = con.prepareStatement("insert into student values(?,?)");
        ps.setInt(1,s.getSno());
        ps.setString(2,s.getFirstname());

        ps.execute();

        return true;
    }

    public Student getRecord(int sno) throws SQLException, ClassNotFoundException {
        con = getCon();
        con.prepareStatement("select * from student where sno = ?");
        ps.setInt(1,sno);

        ResultSet rs = ps.executeQuery();
        Student s= new Student();

        int snoTemp =  rs.getInt(1);
        String fistnameTemp = rs.getString(2);
        s.setSno(snoTemp);
        s.setFirstname(fistnameTemp);

        return s;

    }
}
