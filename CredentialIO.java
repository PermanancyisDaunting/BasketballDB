import java.io.*;
import java.util.Scanner;

public class CredentialIO 
{
	 /**macs are weird and their filepaths arent well liked in java IDEs. replace this with whatever your filename for sign in 
     * credentials and you should be good.
	 *format:
	 *UserName
	 *Password
	 *THATS IT
	 */
	
    String user = "";
    String pass = "";
	CredentialIO()
	{
		
	}
	
	public String getUser() throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("/Users/emilyclark/Documents/CS485/BasketballDB/FrontEnd/src/credentials.txt"));
		try
	    {
	    	  user = inFile.nextLine();
	    	  pass = inFile.nextLine();
	    }//end try
	    catch (NullPointerException E)
	    {
	      System.out.println("Error during import. Please try again.");
	    }//end catch
	    inFile.close();

	    return user;
	}
	
	public String getPass() throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("/Users/emilyclark/Documents/CS485/BasketballDB/FrontEnd/src/credentials.txt"));
		try
	    {
	    	  user = inFile.nextLine();
	    	  pass = inFile.nextLine();
	    }//end try
	    catch (NullPointerException E)
	    {
	      System.out.println("Error during import. Please try again.");
	    }//end catch
	    inFile.close();
		
	    return pass;
	}
}
