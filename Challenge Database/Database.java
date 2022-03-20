import java.sql.*;

public class Database {
    Connection con;
    public void establish_conection(){
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Empleados","admin","admin");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
