import java.io.*;
import java.sql.SQLException;


public class FBBClient {
	
	  public static void main(String [] args) throws FileNotFoundException, SQLException
	  {
		  //declare variables
		int select = 1;
          	
	    FBBMenus traverse = new FBBMenus(select);
	    
	    traverse.TopMenu(select);
	    
	  }//end main

}//end class
