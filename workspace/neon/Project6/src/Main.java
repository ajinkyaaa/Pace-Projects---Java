import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main { 
  public static void main(String[] args) {
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(
          "jdbc:mysql://localhost/?user=root&password="); //I
        Statement stmt = con.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS mydatabase"); //II
        stmt.execute("USE mydatabase");
        stmt.execute("DROP TABLE IF EXISTS mytable");
        stmt.execute("CREATE TABLE IF NOT EXISTS mytable( Username varchar(20),Password varchar(20))");
        stmt.execute("INSERT INTO mytable VALUES('John Doe','John')");
  	  stmt.execute("INSERT INTO mytable VALUES('Jane Doe','Jane')");
        ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
        while ( rs.next())
          System.out.println(rs.getString(1)+"Password :" + rs.getString(2) );


    } catch (Exception ex) {
      System.out.println("LocalizedMessage: " +
	  ex.getLocalizedMessage());
      System.out.println("Message: " + ex.getMessage());
      System.out.println("Cause: " + ex.getCause());
      System.out.println("Class: " + ex.getClass());
      System.out.println("StackTrace: " + ex.getStackTrace());
      System.exit(0);
    }
    System.out.println("Program terminated with no error.");
  }
}
