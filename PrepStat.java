import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepStat 
{
	public PrepStat()
	{
		
	}
	
    
	public ResultSet PrepStatOneVar(String query, String varOne) throws FileNotFoundException, SQLException
	{
		//declare variables
		String user = "";
		String pass = "";
	    DBConnect dbReader = new DBConnect();
	    CredentialIO credIO = new CredentialIO();
	    ResultSet resultSet = null;
	    user = credIO.getUser();
	    pass = credIO.getPass();
	   
	    
	    PreparedStatement pstmt = dbReader.Connect(user, pass).prepareStatement( query);
	    pstmt.setString( 1, varOne);
	    
	    resultSet = pstmt.executeQuery();
		    
		    return resultSet;
	}
	public ResultSet PrepStatTwoVar(String query, String varOne, String varTwo) throws FileNotFoundException, SQLException
	{
		//declare variables
				String user = "";
				String pass = "";
			    DBConnect dbReader = new DBConnect();
			    CredentialIO credIO = new CredentialIO();
			    ResultSet resultSet = null;
			    user = credIO.getUser();
			    pass = credIO.getPass();
	
			    
			    PreparedStatement pstmt = dbReader.Connect(user, pass).prepareStatement( query);
			    pstmt.setString( 1, varOne);
			    pstmt.setString(2, varTwo);
			    
			    resultSet = pstmt.executeQuery();
		return resultSet;
	}
	public ResultSet PrepStatThreeVar(String query, String varOne, String varTwo, String varThree) throws FileNotFoundException, SQLException
	{
		//declare variables
				String user = "";
				String pass = "";
			    DBConnect dbReader = new DBConnect();
			    CredentialIO credIO = new CredentialIO();
			    ResultSet resultSet = null;
			    user = credIO.getUser();
			    pass = credIO.getPass();

			    
			    PreparedStatement pstmt = dbReader.Connect(user, pass).prepareStatement( query);

			    pstmt.setString( 1, varOne);
			    pstmt.setString(2, varTwo);
			    pstmt.setString(3, varThree);
			    
			    resultSet = pstmt.executeQuery();
		return resultSet;
	}
	public ResultSet PrepStatFourVar(String query, String varOne, String varTwo, String varThree, String varFour) throws FileNotFoundException, SQLException
	{
		//declare variables
		String user = "";
		String pass = "";
	    DBConnect dbReader = new DBConnect();
	    CredentialIO credIO = new CredentialIO();
	    ResultSet resultSet = null;
	    user = credIO.getUser();
	    pass = credIO.getPass();
	    
	    PreparedStatement pstmt = dbReader.Connect(user, pass).prepareStatement( query);
	    pstmt.setString( 1, varOne);
	    pstmt.setString(2, varTwo);
	    pstmt.setString(3, varThree);
	    pstmt.setString(4, varFour);
	    
	    resultSet = pstmt.executeQuery();
		return resultSet;
	}
	
}
