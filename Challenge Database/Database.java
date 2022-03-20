import java.sql.*;

public class Database {
    Connection con;
    Statement s;
    public Database() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Empleados", "admin", "admin");
            s = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void enterData(){
        try {
            s.executeUpdate("INSERT INTO Municipalidad(ciudad, cod_postal) \n" +
                    "VALUES('Bahia Blanca', 8000);");
            s.executeUpdate("INSERT INTO Municipalidad(ciudad, cod_postal) \n" +
                    "VALUES('Mar del Plata', 7600);");
            s.executeUpdate("INSERT INTO Empleado(nombre, apellido, telefono, mail, nro_doc, tipo_doc, salario_promedio, puesto, antigüedad, cod_postal)\n" +
                    "VALUES('Juan', 'Perez','154000000','juanperez360@gmail.com', '30000000', 'DNI', 90000, 'recepcionista', 13, 8000);");
            s.executeUpdate("INSERT INTO Empleado(nombre, apellido, telefono, mail, nro_doc, tipo_doc, salario_promedio, puesto, antigüedad, cod_postal)\n" +
                    "VALUES('Maria', 'Romero','154111111','mariaromero42@gmail.com', '31111111', 'DNI', 75000, 'secretaria', 11, 7600);");
            s.executeUpdate("INSERT INTO Empleado(nombre, apellido, telefono, mail, nro_doc, tipo_doc, salario_promedio, puesto, antigüedad, cod_postal)\n" +
                    "VALUES('Matias', 'Gonzalez','154222222','matiasgonzalez123@gmail.com', '32222222', 'DNI', 30000, 'conserje', 3, 8000);");
            s.executeUpdate("INSERT INTO Empleado(nombre, apellido, telefono, mail, nro_doc, tipo_doc, salario_promedio, puesto, antigüedad, cod_postal)\n" +
                    "VALUES('Andres', 'Vilches','154333333','andresvilches85@gmail.com', '33333333', 'DNI', 69000, 'secretario', 11, 8000);");
            s.executeUpdate("INSERT INTO Empleado(nombre, apellido, telefono, mail, nro_doc, tipo_doc, salario_promedio, puesto, antigüedad, cod_postal)\n" +
                    "VALUES('Susana', 'Perez','154444444','susanaperez12345@gmail.com', '34444444', 'DNI', 120000, 'tesorera', 5, 7600);");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getEmpleados(){
        try {
            ResultSet rs = s.executeQuery("SELECT nombre, apellido, telefono, mail, puesto, ciudad \n" +
                    "\tFROM Empleado JOIN Municipalidad ON Empleado.cod_postal = Municipalidad.cod_postal\n" +
                    "\tWHERE antigüedad>= 10 AND antigüedad<=15 AND salario_promedio>=70000;");
            System.out.println("Empleados que cumplen con las condiciones:\n");
            while(rs.next()){
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String mail = rs.getString("mail");
                String puesto = rs.getString("puesto");
                String ciudad = rs.getString("ciudad");
                System.out.println("Nombre:"+nombre+" "+apellido+"\nTEL: "+telefono+"\nMail: "+mail+"\nPuesto: "+puesto+"\nMunicipalidad: "+ciudad+"\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
