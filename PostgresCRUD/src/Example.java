        /*STEPS to connect to a database:
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
        */

package src;
//1) import package
import java.sql.*;               

public class Example {

    public static void main(String[] args) throws Exception {  

        int sid = 18; int marks = 100; String sname = "Juanito"; //Para PreparedStatment

        /*2) OPCTIONAL: Load and register
        Class.forName("org.postgresql.Driver");  */
        
        //3) Create connection
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "1928");
        System.out.println("Connection successful!");

        //4) Create statement
        Statement st1 = con.createStatement(); //nomal
        PreparedStatement st2 = con.prepareStatement("insert into student values (?,?,?)"); //prepared

        //5) Excecute statement
        st2.setInt(1, sid); //CREATE CON PREPARED
        st2.setInt(2, marks); //CREATE CON PREPARED
        st2.setString(3, sname); //CREATE CON PREPARED
        st2.execute(); //CREATE CON PREPARED
        st1.execute("insert into student values (17, 60, 'Clain')"); //CREATE NORMAL
        st1.execute("update student set sname = 'Nicotico' where sid = 1"); //UPDATE NORMAL
        st1.execute("delete from student where sid = 16"); //DELETE NORMAL

        //6) Process results
        ResultSet rs1 = st1.executeQuery("select * from student order by sid"); //READ
        // rs1.next();
        // String name = rs1.getString("sname"); //READ sname de la fila 1 
        // System.out.println(name);

        while (rs1.next()){                  //Imprimir todos los datos
            System.out.println(rs1.getString(3)+" : "+rs1.getInt(1)+
            " : "+rs1.getInt(2));
        }

        //7) Close
        con.close();

    }
}
