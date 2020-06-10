
package jdbc;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Jdbc {
   public static void main(String[] args)throws Exception{
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","");
          System.out.println("Connected");
             Statement st = (Statement) conn.createStatement();
     
      
     
      //st = (Statement) conn.createStatement();
     
      //String table_sql = "CREATE TABLE INFORMATION " +"(id INTEGER not NULL, " +" first VARCHAR(25), " + " last VARCHAR(25), " + " age INTEGER, " +" PRIMARY KEY ( id ))";

      //st.executeUpdate(table_sql);
      //System.out.println("Table created successfully");
     
      
      //st = (Statement) conn.createStatement();
     
      //String insert_sql = "INSERT INTO INFORMATION " +
        //           "VALUES (1, 'Muskan', 'Agrawal', 21)";
      //st.executeUpdate(insert_sql);
      //insert_sql = "INSERT INTO INFORMATION " +
          //         "VALUES (2, 'Priyanka', 'Sharma', 21)";
    //  st.executeUpdate(insert_sql);
       String insert_sql = "INSERT INTO INFORMATION " +
                   "VALUES (3, 'Saloni', 'Patidar', 21)";
       st.executeUpdate(insert_sql);
     
     
      System.out.println("Inserted records ");

            conn.close(); 
          return conn;
        }
        catch(Exception e )
        {
       System.out.println(e.getMessage());
       
        }
    }
    
}
