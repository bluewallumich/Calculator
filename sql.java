import java.io.IOException;
import java.sql.*;
public class BasicBatchDBRead {
	
public void getPartName()
throws SQLException, ClassNotFoundException {
	
String partName = null;	
String partDescription = null;
String partPrice = null;
	
// Load the JDBC driver
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver loaded");
// Establish a connection
Connection connection = DriverManager.getConnection
//Table live inside of a database.
("jdbc:mysql://localhost/test","root","ETOWN");
System.out.println("Database connected");
// Create a statement
Statement statement = connection.createStatement();
// Execute a statement

ResultSet resultSet = statement.executeQuery
("select * from Inventory");
// Iterate through the result and print the student names
//
while (resultSet.next())
{
   partName = resultSet.getString(2);
   partDescription = resultSet.getString(3);
   partPrice = resultSet.getString(4);
   
   System.out.println("Part Name: " + partName);
   System.out.println("Part Description: " +  partDescription);
   System.out.println("Part Price: " + partPrice + "\n");
   
}
// Close the connection
connection.close();


}

public static void main(String[] args) throws IOException 
{
	BasicBatchDBRead x = new BasicBatchDBRead();
	try {
		x.getPartName();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}//end of main
}
