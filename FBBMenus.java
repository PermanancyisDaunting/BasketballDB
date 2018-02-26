import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FBBMenus {
	
	static Scanner console = new Scanner(System.in);
	static DBQueries generator = new DBQueries();
	static PrepStat prepBot = new PrepStat();
	static ResultSet resultSet = null;
	static String pstat1, pstat2, pstat3, pstat4;
	
	public FBBMenus()
	{
		
	}
	public FBBMenus(int select)
	{
		
	}
	public static void TopMenu(int select) throws FileNotFoundException, SQLException
	  {
	   //show menu
	      System.out.println("********************************************");
	      System.out.println("Are you an administrator or a user?");
	      System.out.println("1 --- User");
	      System.out.println("2 --- Admin");
	      System.out.println("0 --- Exit");
	      
	      //input
	      System.out.print("Select a number: "); 
	      select = console.nextInt();
	      
	      if(select >= 0 && select <= 2)
	      {
	         //switch program
	        switch(select)
	        {
	        //user
	          case 1: 
	        	 
	        	  FBBMenus.UserMenu(select);
	        	  break;
	          
	          //admin
	          case 2: 
	        
	        	  FBBMenus.AdminMenu(select);
	        	  break;
	          
	          case 0: 
	            System.out.println("Have a Nice Day!"); 
	            break;
	          default: 
	            System.out.println("Invalid Operation. Please refer to menu.");
	            break;
	        }//end switch
	      }//end if
	      
	  }//end TopMenu
	  
	  public static void AdminMenu(int select) throws FileNotFoundException, SQLException
	  {
		  
		  
	   //show menu
	      System.out.println("********************************************");
	      System.out.println("Are you an administrator or a user?");
	      System.out.println("1 --- Update Existing Data");
	      System.out.println("2 --- Enter New Data");
	      System.out.println("3 --- Up One Menu");
	      System.out.println("0 --- Exit");
	      
	      //input
	      System.out.print("Select a number: "); 
	      select = console.nextInt();
	      
	      if(select >= 0 && select <= 3)
	      {
	         //switch program
	        switch(select)
	        {
	        //user
	          case 1: 
	        	  FBBMenus.UpdateMenu(select);
	          break;
	          //admin
	          case 2: 
	        	  FBBMenus.NewEntryMenu(select);
	          break;
	          
	          //up one level
	          case 3:
	        	  FBBMenus.TopMenu(select);
	        	  
	          case 0: 
	            System.out.println("Have a Nice Day!"); 
	            break;
	          default: 
	            System.out.println("Invalid Operation. Please refer to menu.");
	            break;
	        }//end switch
	      }//end if
	  }//end AdminMenu
	  
	  public static void UpdateMenu(int select) throws FileNotFoundException, SQLException
	  {
	   //show menu
	      System.out.println("********************************************");
	      System.out.println("Updating Data");
	      System.out.println("1 --- Update a Game");
	      System.out.println("2 --- Update a Player");
	      System.out.println("3 --- Update a Coach");
	      System.out.println("4 --- Up One Level");
	      System.out.println("0 --- Exit");
	      
	      //input
	      System.out.print("Select a number: "); 
	      select = console.nextInt();
	      
	      if(select >= 0 && select <= 4)
	      {
	         //switch program
	        switch(select)
	        {
	        //Update Game
	          case 1: 
	        	  //TO-DO
	        	  //PREPAREDSTATEMENTS
	        	  //Choose game based on date.
	        	  //Print game info
	        	  //Verify that they want to change the data
	        	  //Yes? Which column.
	        	  //PREPAREDSTATEMENTS
	        	  System.out.println("not developed.");
	        	  break;
	        	  
	          //Update a Player
	          case 2: 
	        	  //TO-DO
	        	  //PREPAREDSTATEMENTS
	        	  //Choose player based on name.
	        	  //Print player info, team history, and injuries associated
	        	  //Verify that they want to change the data
	        	  //Yes? Which column
	        	  //PREPAREDSTATEMENTS
	        	  System.out.println("not developed.");
	        	  break;
	        	  
	        	  //Update a Coach
	          case 3:
	         	//TO-DO
	        	  //PREPAREDSTATEMENTS
	        	  //Choose coach based on name.
	        	  //Print coach info, assignment history
	        	  //Verify that they want to change the data
	        	  //Yes? Which column
	        	  //PREPAREDSTATEMENTS
	        	  System.out.println("not developed.");
	        	  break;
	          
	        	  //up one level
	          case 4:
	        	  FBBMenus.AdminMenu(select);
	        	  break;
	        	  
	          case 0: 
	            System.out.println("Have a Nice Day!"); 
	            break;
	          default: 
	            System.out.println("Invalid Operation. Please refer to menu.");
	            break;
	        }//end switch
	      }//end if
	  }//end UpdateMenu
	  
	  public static void NewEntryMenu(int select) throws FileNotFoundException, SQLException
	  {
		//show menu
	      System.out.println("********************************************");
	      System.out.println("Entering New Data");
	      System.out.println("1 --- Enter a New Game");
	      System.out.println("2 --- Enter a New Player");
	      System.out.println("3 --- Enter a New Coach");
	      System.out.println("4 --- Enter New Stats For Game");
	      System.out.println("5 --- Up One Level");
	      System.out.println("0 --- Exit");
	      
	      //input
	      System.out.print("Select a number: "); 
	      select = console.nextInt();
	      
	      if(select >= 0 && select <= 5)
	      {
	         //switch program
	        switch(select)
	        {
	        //Add a Game
	          case 1: 
	        	  //TO-DO
	        	  //PREPAREDSTATEMENTS
	        	  //Enter Date of Game
	        	  //Enter Winner
	        	  //Enter Loser
	        	  //Enter Score, format WINNERINT-LOSERINT, pass string
	        	  System.out.println("not developed.");
	        	  break;
	        	  
	          //Add a Player
	          case 2: 
	        	  //TO-DO
	        	  //PREPAREDSTATEMENTS
	        	  //Enter Name (must be first)
	        	  //Enter birth date, height, weight, start date
	        	  //Enter team history
	        	  System.out.println("not developed.");
	        	  break;
	        	  
	        	  //Add a Coach
	          case 3:
	         	//TO-DO
	        	  //PREPAREDSTATEMENTS
	        	  //Enter Name (must be first)
	        	  //Enter Coaching Assignment
	        	  //Enter Team
	        	  //Enter Active Years
	        	  //PREPAREDSTATEMENTS
	        	  System.out.println("not developed.");
	        	  break;
	          
	        	  //Add a Player Stats
	          case 4:
	         	//TO-DO
	        	  //PREPAREDSTATEMENTS
	        	  //Select a Player (if player does not exist, route to add a player)
	        	  //Select a Game (if game does not exist, route to add a game)
	        	  //Select a position and team
	        	  //Enter game stats
	        	  //PREPAREDSTATEMENTS
	        	  System.out.println("not developed.");
	        	  break;
	        	  
	        	  //up one level
	          case 5:
	        	  FBBMenus.AdminMenu(select);
	        	  break;
	        	  
	          case 0: 
	            System.out.println("Have a Nice Day!"); 
	            break;
	          default: 
	            System.out.println("Invalid Operation. Please refer to menu.");
	            break;
	        }//end switch
	      }//end if
	  }//end NewEntryMenu
	  public static void UserMenu(int select) throws FileNotFoundException, SQLException
	  {
		//show menu
	      System.out.println("********************************************");
	      System.out.println("User Menu");
	      System.out.println("1 --- View Player Stats");
	      System.out.println("2 --- View Team Stats");
	      System.out.println("3 --- View Coaches");
	      System.out.println("4 --- Up One Level");
	      System.out.println("0 --- Exit");
	      
	      //input
	      System.out.print("Select a number: "); 
	      select = console.nextInt();
	      
	      if(select >= 0 && select <= 4)
	      {
	         //switch program
	        switch(select)
	        {
	        //View Player Stats
	          case 1: 
	        	  boolean team = false;
	        	  FBBMenus.SeasonOrGameMenu(select, team);
	        	  break;
	        	  
	          //View Team Stats
	          case 2: 
	        	  team = true;
	        	  FBBMenus.SeasonOrGameMenu(select, team);
	        	  break;
	        	  
	        	  //View Coaches
	          case 3:
	        	  FBBMenus.CoachMenu(select);
	        	  break;
	        	  
	        	  //up one level
	          case 4:
	        	  FBBMenus.TopMenu(select);
	        	  break;
	        	  
	          case 0: 
	            System.out.println("Have a Nice Day!"); 
	            break;
	          default: 
	            System.out.println("Invalid Operation. Please refer to menu.");
	            break;
	        }//end switch
	      }//end if
	  }//end UserMenu
	  
	  public static void SeasonOrGameMenu(int select, boolean team) throws FileNotFoundException, SQLException
	  {
		//show menu
	      System.out.println("********************************************");
	      if(team == false)
	    		  {
	      System.out.println("Player Stats Menu");
	    		  }
	      else
	    	  {
	    		  System.out.println("Team Stats Menu");
	    	  }
	      System.out.println("1 --- View Stats By Game");
	      System.out.println("2 --- View Stats By Season");
	      System.out.println("3 --- Up One Level");
	      System.out.println("0 --- Exit");
	      
	      //input
	      System.out.print("Select a number: "); 
	      select = console.nextInt();
	      
	      if(select >= 0 && select <= 3)
	      {
	         //switch program
	        switch(select)
	        {
	        //View Player Stats
	          case 1: 
	        	  char multiplicity = 'g';
	        	  FBBMenus.StatsMenu(select, team, multiplicity);
	        	  break;
	        	  
	          //View Game Stats
	          case 2: 
	        	  multiplicity = 's';
	        	  FBBMenus.StatsMenu(select, team, multiplicity);
	        	  break;
	        	  
	        	  //up one level
	          case 3:
	        	  FBBMenus.UserMenu(select);
	        	  break;
	        	  
	          case 0: 
	            System.out.println("Have a Nice Day!"); 
	            break;
	          default: 
	            System.out.println("Invalid Operation. Please refer to menu.");
	            break;
	        }//end switch
	      }//end if
	  }//end PlayerStatsMenu
	  
	  public static void StatsMenu(int select, boolean team, char multiplicity) throws FileNotFoundException, SQLException
	  {
		  
		  
			//show menu
	      System.out.println("********************************************");
	      if(team == false)
		  {
	    	  System.out.println("Player Stats Menu");
		  }
	      else
	      {
		  System.out.println("Team Stats Menu");
	      }
	      System.out.println("1 --- Total Points");
	      System.out.println("2 --- Field Goals");
	      System.out.println("3 --- Field Goal Percentage");
	      System.out.println("4 --- Three Point Throws");
	      System.out.println("5 --- Three Point Percentage");
	      System.out.println("6 --- Offensive Rebounds");
	      System.out.println("7 --- Defensive Rebounds");
	      System.out.println("8 --- Total Rebounds");
	      System.out.println("9 --- Assists");
	      System.out.println("10 --- Steals");
	      System.out.println("11 --- Fouls");
	      System.out.println("12 --- Turnovers");
	      System.out.println("13 --- Injuries (Per Season Only.)");
	      System.out.println("14 --- Game Win Rate (Per Season Only.)");
	      System.out.println("15 --- Up One Level");
	      System.out.println("0 --- Exit");
	      
	      //input
	      System.out.print("Select a number: "); 
	      select = console.nextInt();
	      
	      if(select >= 0 && select <= 14)
	      {
	         //switch program
	        switch(select)
	        {
	        //Total Points
	        case 1:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Field Goals
	        case 2:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Field Goal Percentage
	        case 3:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Three Points
	        case 4:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Three Point Percentage
	        case 5:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 		System.out.println("Enter Date Of Game: (YYYY-MM-DD)");
	        	 		pstat1 = console.next();
	        	 		System.out.println("Enter Player's Last Name:");
	        	 		pstat2 = console.next();
	        	 		System.out.println("Enter Player's First Name:");
	        	 		pstat3 = console.next();
	        	 		
	        	 		resultSet = prepBot.PrepStatThreeVar(generator.get3PPercentageForGame(), pstat1, pstat2, pstat3);
	        	 		while(resultSet.next())
	        	 		{
	        	 			String res = resultSet.getString("Three_Point_Percentage");
	        	          	System.out.println(pstat3 + " " + pstat2 + " had a " + res + "%  Three Point Accuracy on " + pstat1);
	        	 		}
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		System.out.println("Enter Player's First Name:");
	        	 		pstat1 = console.next();
	        	 		System.out.println("Enter Player's Last Name:");
	        	 		pstat2 = console.next();
	        	 		System.out.println("Enter Season's Starting Year: (YYYY)");
	        	 		pstat3 = console.next();
	        	 		int tempInt = Integer.valueOf(pstat3);
	        	 		tempInt +=1;
	        	 		pstat4 = "" + tempInt;
	        	 		resultSet = prepBot.PrepStatFourVar(generator.get3PPercentageForSeason(), pstat1, pstat2, pstat3, pstat4);
	        	 		while(resultSet.next())
	        	 		{
	        	 			String res = resultSet.getString("Season Three-Pointer Percentage");
	        	          	System.out.println(pstat3 + " " + pstat2 + " had a " + res + "%  Three Point Accuracy in the " + pstat3 + "-" + pstat4 + " season.");
	        	 		}
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Offensive Rebound
	        case 6:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Defensive Rebound
	        case 7:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Total Rebounds
	        case 8:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Assists
	        case 9:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 	System.out.println("Enter Date Of Game: (YYYY-MM-DD)");
        	 		pstat1 = console.next();
        	 		System.out.println("Enter Player's Last Name:");
        	 		pstat2 = console.next();
        	 		System.out.println("Enter Player's First Name:");
        	 		pstat3 = console.next();
        	 		
        	 		resultSet = prepBot.PrepStatThreeVar(generator.getAssistsForGameXByPlayerY(), pstat1, pstat2, pstat3);
        	 		while(resultSet.next())
        	 		{
        	 			String res = resultSet.getString("Assists");
        	          	System.out.println(pstat3 + " " + pstat2 + " had a " + res + " Assists on " + pstat1);
        	 		}
	        	 		
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		System.out.println("Enter Player's First Name:");
	        	 		pstat1 = console.next();
	        	 		System.out.println("Enter Player's Last Name:");
	        	 		pstat2 = console.next();
	        	 		System.out.println("Enter Season's Starting Year: (YYYY)");
	        	 		pstat3 = console.next();
	        	 		int tempInt = Integer.valueOf(pstat3);
	        	 		tempInt +=1;
	        	 		pstat4 = "" + tempInt;
	        	 		resultSet = prepBot.PrepStatFourVar(generator.getAssistsForSeasonXByPlayerY(), pstat3, pstat4, pstat1, pstat2);
	        	 		while(resultSet.next())
	        	 		{
	        	 			String res = resultSet.getString("totalAssists");
	        	          	System.out.println(pstat3 + " " + pstat2 + " had  " + res + " Assists in the " + pstat3 + "-" + pstat4 + " season.");
	        	 		}
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Steals
	        case 10:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Fouls
	        case 11:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 		System.out.println("Enter Date Of Game: (YYYY-MM-DD)");
	        	 		pstat1 = console.next();
	        	 		System.out.println("Enter Player's Last Name:");
	        	 		pstat2 = console.next();
	        	 		System.out.println("Enter Player's First Name:");
	        	 		pstat3 = console.next();
	        	 		
	        	 		resultSet = prepBot.PrepStatThreeVar(generator.getFoulsForGameXByPlayerY(), pstat1, pstat2, pstat3);
	        	 		while(resultSet.next())
	        	 		{
	        	 			String res = resultSet.getString("Fouls");
	        	          	System.out.println(pstat3 + " " + pstat2 + " made " + res + " Foul Plays on " + pstat1);
	        	 		}
	        	 		
	        	 		
	        	 		
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         //Turnovers
	        case 12:
	         if(team == false)
	         {
	        	 	if(multiplicity == 'g') //Player Stats Per Game
	        	 	{
	        	 
	        	 	}
	        	 	else //Player Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	         else
	         {
	        	 	if(multiplicity == 'g') //Team Stats Per Game
	        	 	{
	        	 		
	        	 	}
	        	 	else //Team Stats Per Season
	        	 	{
	        	 		
	        	 	}
	         }
	       //Injuries - SEASON ONLY
	        case 13:
	         if(team == false) //Player Injuries
	         {
	        	 
	         }
	         else //Team Injuries
	         {
	        	 
	         }
	       //Game Win Rate - SEASON ONLY
	        case 14:
	         if(team == false) //Player Win Rate
	         {
	        	 	
	         }
	         else //Team Win Rate
	         {
	        	 
	         }
	        	  
	        	  //up one level
	          case 15:
	        	  FBBMenus.UserMenu(select);
	        	  break;
	        	  
	          case 0: 
	            System.out.println("Have a Nice Day!"); 
	            break;
	          default: 
	            System.out.println("Invalid Operation. Please refer to menu.");
	            break;
	        }//end switch
	      }//end if
	  }//end StatsMenu
	  
	  public static void CoachMenu(int select) throws FileNotFoundException, SQLException
	  {
		//show menu
	      System.out.println("********************************************");
	      System.out.println("Coach Menu");
	      System.out.println("1 --- Search By Team");
	      System.out.println("2 --- Search By Year");
	      System.out.println("3 --- Search By Name");
	      System.out.println("4 --- Search By History");
	      System.out.println("5 --- Up One Level");
	      System.out.println("0 --- Exit");
	      
	      //input
	      System.out.print("Select a number: "); 
	      select = console.nextInt();
	      
	      if(select >= 0 && select <= 5)
	      {
	         //switch program
	        switch(select)
	        {
	        //Search By Team
	          case 1: 
	        	  
	        	  break;
	        	  
	          //Search By Year
	          case 2: 
	        	  
	        	  break;
	        	  
	        	  //Search By Name
	          case 3:
	        	  
	        	  break;
	        	  
	        	  //up one level
	          case 5:
	        	  FBBMenus.UserMenu(select);
	        	  break;
	        	  
	          case 0: 
	            System.out.println("Have a Nice Day!"); 
	            break;
	          default: 
	            System.out.println("Invalid Operation. Please refer to menu.");
	            break;
	        }//end switch
	      }//end if
	  }//end CoachMenu
}
