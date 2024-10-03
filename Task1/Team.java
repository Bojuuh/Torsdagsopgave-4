import java.util.ArrayList;

class Team{
	
	private String teamName;
	private int teamRank;
	private ArrayList<String> players;

	public Team(String teamName){
		this.teamName = teamName;
		
		this.players = new ArrayList<>();
		}
		public int getRank(){
			return teamRank;
		}
		public void setRank(int newTeamRank){
			this.teamRank = newTeamRank;
		}
		public String toString(){
			String s = "Team: " + this.teamName + " | Rank: "+ teamRank + "\nPlayers:\n";

			for (String player : players){
				s += "- " + player + "\n";
			}
			return s;
		}
		public void addPlayer(String playerName){
			players.add(playerName);
		}
}