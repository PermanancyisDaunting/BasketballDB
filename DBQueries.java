
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
    public String get3PPercentageForSeason(){ //implemented
                
        query = "SELECT FirstName, LastName, SUM(tot3PP)/COUNT(tot3PP) as 'Season Three-Pointer Percentage' "
        		+ "FROM ( SELECT FirstName, LastName, Date, Three_Point_Percentage as tot3PP FROM player_stats_in_game "
        		+ "JOIN player USING(PlayerID) JOIN game USING(GameID) WHERE FirstName = ? AND LastName = ? "
        		+ "AND Date BETWEEN ? '-08-01' AND ? '-06-31' ) as all3PPercentages";
        
        return query;
        
    }
    
    public String getAssistsForGameXByPlayerY(){
                
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
    public String getAssistsForSeasonXByPlayerY() {
                
        query = "SELECT FirstName, LastName, SUM(Assists) \n" +
                " FROM" +
                " (\n" +
                "	SELECT PlayerID, FirstName, LastName, GameID, Date, Assists \n" +
                "	FROM player_stats_in_game \n" +
                "	JOIN \n" +
                "	(\n" +
                "    		SELECT GameID, Date, Assists \n" +
                "		FROM game \n" +
                "		WHERE	Date BETWEEN ? '-08-01' AND ? '-06-31' \n" +
                "	) as gameRange USING(GameID) \n" +
                "	JOIN \n" +
                "    	(\n" +
                "        	SELECT PlayerID, FirstName, LastName \n" +
                "    		FROM player \n" +
                "    		WHERE	LastName = ? \n" +
                "		AND	FirstName = ? \n" +
                "    	) as playerSelect USING(PlayerID) \n" +
                " ) as totalAssists";
        
        return query;
        
    }
    
    public String getBlocksForGameXByPlayerY(){
                
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
    public String getBlocksForSeasonXByPlayerY() {
                
        query = "SELECT FirstName, LastName, SUM(Blocks)\n" +
                "FROM\n" +
                "(\n" +
                "	SELECT PlayerID, FirstName, LastName, GameID, Date, Blocks\n" +
                "	FROM player_stats_in_game\n" +
                "	JOIN\n" +
                "	(\n" +
                "    		SELECT GameID, Date, Blocks\n" +
                "		FROM game\n" +
                "		WHERE	Date BETWEEN (?)-08-01 AND (?+1)-06-31\n" +
                "	) as gameRange USING(GameID)\n" +
                "	JOIN \n" +
                "    	(\n" +
                "        	SELECT PlayerID, FirstName, LastName\n" +
                "    		FROM player\n" +
                "    		WHERE	LastName = ?\n" +
                "		AND	FirstName = ?\n" +
                "    	) as playerSelect USING(PlayerID)\n" +
                ") as totalBlocks";
        
        return query;
        
    }
    
    
    
    public String getDefensiveReboundsForGameXByPlayerY() {
                
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
    public String getDefensiveReboundsForSeasonXByPlayerY() {
                
        query = "SELECT FirstName, LastName, SUM(Defensive_Rebounds)\n" +
                "FROM\n" +
                "(\n" +
                "	SELECT PlayerID, FirstName, LastName, GameID, Date, Defensive_Rebounds\n" +
                "	FROM player_stats_in_game\n" +
                "	JOIN\n" +
                "	(\n" +
                "    		SELECT GameID, Date, Defensive_Rebounds\n" +
                "		FROM game\n" +
                "		WHERE	Date BETWEEN (?)-08-01 AND (?+1)-06-31\n" +
                "	) as gameRange USING(GameID)\n" +
                "	JOIN \n" +
                "    	(\n" +
                "        	SELECT PlayerID, FirstName, LastName\n" +
                "    		FROM player\n" +
                "    		WHERE	LastName = ?\n" +
                "		AND	FirstName = ?\n" +
                "    	) as playerSelect USING(PlayerID)\n" +
                ") as totalDR";
        
        return query;
        
        
    }
    
    
    public String getFGPercentageForGame() {
                
        query = "SELECT FirstName, LastName, Date, Field_Goal_Percentage\n" +
                " FROM player_stats_in_game\n" +
                " JOIN player USING(PlayerID)\n" +
                " JOIN game USING(GameID)\n" +
                " \n" +
                " WHERE FirstName = ? AND LastName = ? AND Date = ?";
        
        return query;
        
    }
    
    /////////////////////////////////////////////////////////////////////////
    public String getFGPercentageForSeason() {
                
        query = "SELECT FirstName, LastName, SUM(totFGP)/COUNT(totFGP) as Season Field Goal Percentage\n" +
                "FROM\n" +
                "(\n" +
                "	SELECT FirstName, LastName, Date, Field_Goal_Percentage as totFGP\n" +
                "	FROM player_stats_in_game\n" +
                "	JOIN player USING(PlayerID)\n" +
                "	JOIN game USING(GameID)\n" +
                "\n" +
                "	WHERE	FirstName = ? AND LastName = ? \n" +
                "	AND 	Date BETWEEN (?)-08-01AND (?+1)-06-31\n" +
                ") as allFGPercentages";
        
        return query;
        
        
    }
    public String getFTPercentageForGame()
	{
		query="SELECT FirstName, LastName, Date, Free_Throw_Percentage\n" + 
				" FROM player_stats_in_game\n" + 
				" JOIN player USING(PlayerID)\n" + 
				" JOIN game USING(GameID)\n" + 
				"\n" + 
				" WHERE FirstName = ? AND LastName = ? AND Date = ?";
		return query;
	}
	public String getFTPercentageForSeason()
	{
		query= "SELECT FirstName, LastName, SUM(totFTP)/COUNT(totFTP) as Season Free Throw Percentage\n" + 
				"FROM\n" + 
				"(\n" + 
				"	SELECT FirstName, LastName, Date, Free_Throw_Percentage as totFTP\n" + 
				"	FROM player_stats_in_game\n" + 
				"	JOIN player USING(PlayerID)\n" + 
				"	JOIN game USING(GameID)\n" + 
				"\n" + 
				"	WHERE	FirstName = ? AND LastName = ? \n" + 
				"	AND 	Date BETWEEN (?)-08-01AND (?+1)-06-31\n" + 
				") as allFTPercentages";
		return query;
	}
	public String getFoulsForGameXByPlayerY()
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
	public String getFoulsForSeasonXByPlayerY()
	{
		query="SELECT FirstName, LastName, SUM(Fouls)\n" + 
				"FROM\n" + 
				"(\n" + 
				"	SELECT PlayerID, FirstName, LastName, GameID, Date, Fouls\n" + 
				"	FROM player_stats_in_game\n" + 
				"	JOIN\n" + 
				"	(\n" + 
				"    		SELECT GameID, Date, Fouls\n" + 
				"		FROM game\n" + 
				"		WHERE	Date BETWEEN (?)-08-01 AND (?+1)-06-31\n" + 
				"	) as gameRange USING(GameID)\n" + 
				"	JOIN \n" + 
				"    	(\n" + 
				"        	SELECT PlayerID, FirstName, LastName\n" + 
				"    		FROM player\n" + 
				"    		WHERE	LastName = ?\n" + 
				"		AND	FirstName = ?\n" + 
				"    	) as playerSelect USING(PlayerID)\n" + 
				") as totalFouls";
		return query;
	}
	public String getOffensiveReboundsForGameXByPlayerY()
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
	public String getOffensiveReboundsForSeasonXByPlayerY()
	{
		query="SELECT FirstName, LastName, SUM(Offensive_Rebounds)\n" + 
				"FROM\n" + 
				"(\n" + 
				"	SELECT PlayerID, FirstName, LastName, GameID, Date, Offensive_Rebounds\n" + 
				"	FROM player_stats_in_game\n" + 
				"	JOIN\n" + 
				"	(\n" + 
				"    		SELECT GameID, Date, Offensive_Rebounds\n" + 
				"		FROM game\n" + 
				"		WHERE	Date BETWEEN (?)-08-01 AND (?+1)-06-31\n" + 
				"	) as gameRange USING(GameID)\n" + 
				"	JOIN \n" + 
				"    	(\n" + 
				"        	SELECT PlayerID, FirstName, LastName\n" + 
				"    		FROM player\n" + 
				"    		WHERE	LastName = ?\n" + 
				"		AND	FirstName = ?\n" + 
				"    	) as playerSelect USING(PlayerID)\n" + 
				") as totalOR";
		return query;
	}
	public String getPointsForGameXByPlayerY()
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
	
	public String getPointsForSeasonXByPlayerY()
	{
		query="SELECT FirstName, LastName, SUM(Points)\n" + 
				"FROM\n" + 
				"(\n" + 
				"	SELECT PlayerID, FirstName, LastName, GameID, Date, Points\n" + 
				"	FROM player_stats_in_game\n" + 
				"	JOIN\n" + 
				"	(\n" + 
				"    		SELECT GameID, Date, Points\n" + 
				"		FROM game\n" + 
				"		WHERE	Date BETWEEN (?)-08-01 AND (?+1)-06-31\n" + 
				"	) as gameRange USING(GameID)\n" + 
				"	JOIN \n" + 
				"    	(\n" + 
				"        	SELECT PlayerID, FirstName, LastName\n" + 
				"    		FROM player\n" + 
				"    		WHERE	LastName = ?\n" + 
				"		AND	FirstName = ?\n" + 
				"    	) as playerSelect USING(PlayerID)\n" + 
				") as totalPoints";
		return query;
	}
	public String getReboundsForGameXByPlayerY()
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
	public String getReboundsForSeasonXByPlayerY()
	{
		query ="SELECT FirstName, LastName, SUM(Rebounds)\n" + 
				"FROM\n" + 
				"(\n" + 
				"	SELECT PlayerID, FirstName, LastName, GameID, Date, Rebounds\n" + 
				"	FROM player_stats_in_game\n" + 
				"	JOIN\n" + 
				"	(\n" + 
				"    		SELECT GameID, Date, Rebounds\n" + 
				"		FROM game\n" + 
				"		WHERE	Date BETWEEN (?)-08-01 AND (?+1)-06-31\n" + 
				"	) as gameRange USING(GameID)\n" + 
				"	JOIN \n" + 
				"    	(\n" + 
				"        	SELECT PlayerID, FirstName, LastName\n" + 
				"    		FROM player\n" + 
				"    		WHERE	LastName = ?\n" + 
				"		AND	FirstName = ?\n" + 
				"    	) as playerSelect USING(PlayerID)\n" + 
				") as totalR";
		return query;
	}
	public String getStealsForGameXByPlayerY()
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
	
	public String getStealsForSeasonXByPlayerY()
	{
		query ="SELECT FirstName, LastName, SUM(Steals)\n" + 
				"FROM\n" + 
				"(\n" + 
				"	SELECT PlayerID, FirstName, LastName, GameID, Date, Steals\n" + 
				"	FROM player_stats_in_game\n" + 
				"	JOIN\n" + 
				"	(\n" + 
				"    		SELECT GameID, Date, Steals\n" + 
				"		FROM game\n" + 
				"		WHERE	Date BETWEEN (?)-08-01 AND (?+1)-06-31\n" + 
				"	) as gameRange USING(GameID)\n" + 
				"	JOIN \n" + 
				"    	(\n" + 
				"        	SELECT PlayerID, FirstName, LastName\n" + 
				"    		FROM player\n" + 
				"    		WHERE	LastName = ?\n" + 
				"		AND	FirstName = ?\n" + 
				"    	) as playerSelect USING(PlayerID)\n" + 
				") as totalSteals";
		return 
				query;
	}
	public String getTurnoversForGameXByPlayerY()
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
	
	public String getTurnoversForSeasonXByPlayerY()
	{
		query = "SELECT FirstName, LastName, SUM(Turnovers)"+
	"FROM"+
	"("+
		"SELECT PlayerID, FirstName, LastName, GameID, Date, Turnovers"+
		"FROM player_stats_in_game"+
		"JOIN"+
		"("+
	    		"SELECT GameID, Date, Turnovers"+
			"FROM game"+
			"WHERE	Date BETWEEN (?)-08-01 AND (?+1)-06-31"+
		") as gameRange USING(GameID)"+
		"JOIN "+
	    	"("+
	     "   	SELECT PlayerID, FirstName, LastName"+
	    	"	FROM player"+
	    	"	WHERE	LastName = ?"+
		"	AND	FirstName = ?"+
	    	") as playerSelect USING(PlayerID)"+
	") as totalTurnovers";
		
		return query;
}
}
