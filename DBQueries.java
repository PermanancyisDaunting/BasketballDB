
public class DBQueries {
	String query ="";
	DBQueries()
	{
	
	}
	public String get3PPercentageForGame(){ //implemented
        
        query = "SELECT FirstName, LastName, Date, Three_Point_Percentage\n" +
                " FROM player_stats_in_game\n" +
                " JOIN player USING(PlayerID)\n" +
                " JOIN game USING(GameID)\n" +
                " WHERE FirstName = ? AND LastName = ? AND Date = ?";
        
        return query;
    }
    ///////////////////////////////////////////////////////////////////////////
    public String get3PPercentageForSeason(int date1){ //implemented
                
        query = "SELECT FirstName, LastName, SUM(tot3PP)/COUNT(tot3PP) as 'Season Three-Pointer Percentage'\n" +
"               FROM\n" +
"                 (\n" +
"                 SELECT FirstName, LastName, Date, Three_Point_Percentage as tot3PP\n" +
"                    FROM player_stats_in_game\n" +
"                   JOIN player USING(PlayerID)\n" +
"               JOIN game USING(GameID)\n" +
"               \n" +
"              WHERE	FirstName = ? AND LastName = ? \n" +
"               AND 	Date BETWEEN '"+date1+"-08-01'AND '"+(date1+1)+"-06-31'\n" +
"               ) as all3PPercentages";
        
        return query;
        
    }
    
    public String getAssistsForGameXByPlayerY(){ //implemented
                
        query = "SELECT Assists \n" +
                " FROM player_stats_in_game \n" +
                " JOIN game USING(GameID) \n" +
                " JOIN player USING(playerID) \n" +
                " WHERE 	game.Date = ? \n" +
                " AND 	player.LastName = ? \n" +
                " AND	player.FirstName = ?;";
        
        return query;
        
    }
    
    /////////////////////////////////////////////////////////////////////////
    public String getAssistsForSeasonXByPlayerY(int date1) { //implemented
                
        query = "SELECT FirstName, LastName, SUM(Assists)\n" + 
        		" FROM player_stats_in_game\n" + 
        		" JOIN game ON game.GameID = player_stats_in_game.GameID\n" + 
        		" JOIN player ON player.PlayerID = player_stats_in_game.PlayerID\n" + 
        		" WHERE Date BETWEEN '"+date1+"-08-01' AND '"+(date1 +1)+"-06-31' \n" + 
        		" AND LastName = ? \n" + 
        		" AND	 FirstName = ? ";
        
        return query;
        
    }
    
    public String getBlocksForGameXByPlayerY(){ //implemented
                
        query = "SELECT Blocks \n" +
                " FROM player_stats_in_game \n" +
                " JOIN game USING(GameID) \n" +
                " JOIN player USING(playerID) \n" +
                " WHERE 	game.Date = ? \n" +
                " AND 	player.LastName = ?\n" +
                " AND	player.FirstName = ?;";
        
        return query;
        
        
    }
    
    //////////////////////////////////////////////////////////////////////////
    public String getBlocksForSeasonXByPlayerY(int date1) { //implemented
                
        query = "SELECT FirstName, LastName, SUM(Blocks)\n" + 
        		" FROM player_stats_in_game\n" + 
        		" JOIN game ON game.GameID = player_stats_in_game.GameID\n" + 
        		" JOIN player ON player.PlayerID = player_stats_in_game.PlayerID\n" + 
        		" WHERE Date BETWEEN '"+date1+"-08-01' AND '"+(date1+1)+"-06-31' \n" + 
        		" AND LastName = ? \n" + 
        		" AND	 FirstName = ? ";
        
        return query;
        
    }
    
    
    
    public String getDefensiveReboundsForGameXByPlayerY() { //implemented
                
        query = "SELECT Defensive_Rebounds \n" +
                " FROM player_stats_in_game \n" +
                " JOIN game USING(GameID) \n" +
                " JOIN player USING(playerID) \n" +
                " WHERE 	game.Date = ? \n" +
                " AND 	player.LastName = ?\n" +
                " AND	player.FirstName = ?;";
        
        return query;
        
    }
    
    //////////////////////////////////////////////////////////////////////////
    public String getDefensiveReboundsForSeasonXByPlayerY(int date1) { //implemented
                
        query = "SELECT FirstName, LastName, SUM(Defensive_Rebounds)\n" + 
        		" FROM player_stats_in_game\n" + 
        		" JOIN game ON game.GameID = player_stats_in_game.GameID\n" + 
        		" JOIN player ON player.PlayerID = player_stats_in_game.PlayerID\n" + 
        		" WHERE Date BETWEEN '"+date1+"-08-01' AND '"+(date1+1)+"-06-31' \n" + 
        		" AND LastName = ? \n" + 
        		" AND	 FirstName = ? ";
        
        return query;
        
        
    }
    
    
    public String getFGPercentageForGame() { //implemented
                
        query = "SELECT FirstName, LastName, Date, Field_Goal_Percentage\n" +
                " FROM player_stats_in_game\n" +
                " JOIN player USING(PlayerID)\n" +
                " JOIN game USING(GameID)\n" +
                " \n" +
                " WHERE FirstName = ? AND LastName = ? AND Date = ?";
        
        return query;
        
    }
    
    /////////////////////////////////////////////////////////////////////////
    public String getFGPercentageForSeason(int date1) { //implemented
                
        query = "SELECT FirstName, LastName, SUM(totFGP)/COUNT(totFGP) as 'Season Field Goal Percentage'\n" +
                "FROM\n" +
                "(\n" +
                "	SELECT FirstName, LastName, Date, Field_Goal_Percentage as totFGP\n" +
                "	FROM player_stats_in_game\n" +
                "	JOIN player USING(PlayerID)\n" +
                "	JOIN game USING(GameID)\n" +
                "\n" +
                "	WHERE	FirstName = ? AND LastName = ? \n" +
                "	AND 	Date BETWEEN '"+date+"-08-01' AND '"+(date1+1)+"-06-31' \n" +
                ") as allFGPercentages";
        
        return query;
        
        
    }
    public String getFTPercentageForGame() //implemented
	{
		query="SELECT FirstName, LastName, Date, Free_Throw_Percentage\n" + 
				" FROM player_stats_in_game\n" + 
				" JOIN player USING(PlayerID)\n" + 
				" JOIN game USING(GameID)\n" + 
				"\n" + 
				" WHERE FirstName = ? AND LastName = ? AND Date = ?";
		return query;
	}
	public String getFTPercentageForSeason(int date1) //implemented
	{
		query= "SELECT FirstName, LastName, SUM(totFTP)/COUNT(totFTP) as 'Season Free Throw Percentage' \n" + 
				"FROM\n" + 
				"(\n" + 
				"	SELECT FirstName, LastName, Date, Free_Throw_Percentage as totFTP\n" + 
				"	FROM player_stats_in_game\n" + 
				"	JOIN player USING(PlayerID)\n" + 
				"	JOIN game USING(GameID)\n" + 
				"\n" + 
				"	WHERE	FirstName = ? AND LastName = ? \n" + 
				"	AND 	Date BETWEEN '"+date+"-08-01' AND '"+(date1+1)+"-06-31' \n" + 
				") as allFTPercentages";
		return query;
	}
	public String getFoulsForGameXByPlayerY() //implemented
	{
		query="SELECT Fouls \n" + 
				" FROM player_stats_in_game \n" + 
				" JOIN game USING(GameID) \n" + 
				" JOIN player USING(playerID) \n" + 
				" WHERE game.Date = ? \n" + 
				" AND player.LastName = ? \n" + 
				" AND player.FirstName = ? ";
		return query;
	}
	public String getFoulsForSeasonXByPlayerY(int date1) //implemented
	{
		query="SELECT FirstName, LastName, SUM(Fouls)\n" +
                    "FROM player_stats_in_game\n" +
                    "JOIN game ON game.GameID = player_stats_in_game.GameID\n" +
                    "JOIN player ON player.PlayerID = player_stats_in_game.PlayerID\n" +
                    "WHERE Date BETWEEN '"+date1+"-08-01' AND '"+(date1+1)+"-06-31'\n" +
                    "AND LastName = ?\n" +
                    "AND	FirstName = ?";
		return query;
	}
	public String getOffensiveReboundsForGameXByPlayerY() //implemented
	{
		query="SELECT Offensive_Rebounds \n" + 
				" FROM player_stats_in_game \n" + 
				" JOIN game USING(GameID) \n" + 
				" JOIN player USING(playerID) \n" + 
				" WHERE 	game.Date = ? \n" + 
				" AND 	player.LastName = ?\n" + 
				" AND	 player.FirstName = ?;";
		return query;
	}
	public String getOffensiveReboundsForSeasonXByPlayerY(int date1) //implemented
	{
		query="SELECT FirstName, LastName, SUM(Offensive_Rebounds)\n" +
                    "FROM player_stats_in_game\n" +
                    "JOIN game ON game.GameID = player_stats_in_game.GameID\n" +
                    "JOIN player ON player.PlayerID = player_stats_in_game.PlayerID\n" +
                    "WHERE Date BETWEEN '"+date1+"-08-01' AND '"+(date1+1)+"-06-31'\n" +
                    "AND LastName = ?\n" +
                    "AND	FirstName = ?";
		return query;
	}
	public String getPointsForGameXByPlayerY() //implemented
	{
		query="SELECT Points \n" + 
				" FROM player_stats_in_game \n" + 
				" JOIN game USING(GameID) \n" + 
				" JOIN player USING(playerID) \n" + 
				" WHERE 	game.Date = ? \n" + 
				" AND 	player.LastName = ?\n" + 
				" AND 	player.FirstName = ?;";
		return query;
	}
	
	public String getPointsForSeasonXByPlayerY(int date1) //implemented
	{
		query="SELECT FirstName, LastName, SUM(Points)\n" +
                    "FROM player_stats_in_game\n" +
                    "JOIN game ON game.GameID = player_stats_in_game.GameID\n" +
                    "JOIN player ON player.PlayerID = player_stats_in_game.PlayerID\n" +
                    "WHERE Date BETWEEN '"+date1+"-08-01' AND '"+(date1+1)+"-06-31'\n" +
                    "AND LastName = ?\n" +
                    "AND	FirstName = ?";
		return query;
	}
	public String getReboundsForGameXByPlayerY() //implemented
	{
		query ="SELECT Rebounds \n" + 
				" FROM player_stats_in_game \n" + 
				" JOIN game USING(GameID) \n" + 
				" JOIN player USING(playerID) \n" + 
				" WHERE 	game.Date = ? \n" + 
				" AND 	player.LastName = ?\n" + 
				" AND	 player.FirstName = ?;";
		return query;
	}
	public String getReboundsForSeasonXByPlayerY(int date1) //implemented
	{
		query ="SELECT FirstName, LastName, SUM(Rebounds)\n" +
                    "FROM player_stats_in_game\n" +
                    "JOIN game ON game.GameID = player_stats_in_game.GameID\n" +
                    "JOIN player ON player.PlayerID = player_stats_in_game.PlayerID\n" +
                    "WHERE Date BETWEEN '"+date1+"-08-01' AND '"+(date1+1)+"-06-31'\n" +
                    "AND LastName = ?\n" +
                    "AND	FirstName = ?";
		return query;
	}
	public String getStealsForGameXByPlayerY() //implemented
	{
	query ="SELECT Steals \n" + 
			" FROM player_stats_in_game \n" + 
			" JOIN game USING(GameID) \n" + 
			" JOIN player USING(playerID) \n" + 
			" WHERE 	game.Date = ? \n" + 
			" AND 	player.LastName = ?\n" + 
			" AND 	player.FirstName = ?;";
	return query;
	}
	
	public String getStealsForSeasonXByPlayerY(int date1) //implemented
	{
		query ="SELECT FirstName, LastName, SUM(Steals)\n" +
                    "FROM player_stats_in_game\n" +
                    "JOIN game ON game.GameID = player_stats_in_game.GameID\n" +
                    "JOIN player ON player.PlayerID = player_stats_in_game.PlayerID\n" +
                    "WHERE Date BETWEEN '"+date1+"-08-01' AND '"+(date1+1)+"-06-31'\n" +
                    "AND LastName = ?\n" +
                    "AND	FirstName = ?";
		return 
				query;
	}
	public String getTurnoversForGameXByPlayerY() //implemented
	{
		query = " SELECT Turnovers \n" + 
				" FROM player_stats_in_game \n" + 
				" JOIN game USING(GameID) \n" + 
				" JOIN player USING(playerID) \n" + 
				" WHERE 	game.Date = ? \n" + 
				" AND 	player.LastName = ?\n" + 
				" AND 	player.FirstName = ?;";
				return query;
	}
	
	public String getTurnoversForSeasonXByPlayerY(int date1) //implemented
	{
		query = "SELECT FirstName, LastName, SUM(Turnovers)\n" +
                    "FROM player_stats_in_game\n" +
                    "JOIN game ON game.GameID = player_stats_in_game.GameID\n" +
                    "JOIN player ON player.PlayerID = player_stats_in_game.PlayerID\n" +
                    "WHERE Date BETWEEN '"+date1+"-08-01' AND '"+(date1+1)+"-06-31'\n" +
                    "AND LastName = ?\n" +
                    "AND	FirstName = ?";
		
		return query;
}
}
