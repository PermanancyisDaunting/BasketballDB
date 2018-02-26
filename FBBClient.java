import java.io.*;
import java.util.Scanner;
public class FBBClient {
	
	  public static void main(String [] args) throws FileNotFoundException
	  {
		  //declare variables
		String user = "";
		String pass = "";
		int select = 1;
	    DBConnect dbReader = new DBConnect();
	    CredentialIO credIO = new CredentialIO();
	    user = credIO.getUser();
	    pass = credIO.getPass();

	    dbReader.Connect(user, pass);
	    
	    
	    FBBMenus traverse = new FBBMenus(select);
	    traverse.TopMenu(select);
	    
	  }//end main

}//end class
