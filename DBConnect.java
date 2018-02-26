import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public DBConnect()
	{
		
	}

	public void Connect(String user, String pass)
	{
	//connect to DB
	  Connection conn = null;

     try
     {

         String url = "jdbc:mysql://45.33.16.155/qn4795oh_FantasyBasketball";
         Class.forName ("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection (url, user, pass);
         System.out.println ("Database connection established");
     }
     catch (Exception e)
     {
         e.printStackTrace();

     }
	}//end Connect
	
	public void Terminate(Connection conn)
	{

	         if (conn != null)
	         {
	             try
	             {
	                 conn.close ();
	                 System.out.println ("Database connection terminated");
	             }
	             catch (Exception e) { /* ignore close errors */ }
	         }
	     }
}
