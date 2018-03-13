import java.util.ArrayList;

public class Roster {

	private String teamName;
	private ArrayList<Player> teamList;
	
	public Roster(){
		System.out.println("A new roster is created");
		teamList = new ArrayList<Player>();
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public ArrayList<Player> getTeamList() {
		return teamList;
	}
	public void setTeamList(ArrayList<Player> teamList) {
		this.teamList = teamList;
	}
	public void addToTeam(Player p){
		teamList.add(p);
	}
	public String displayRoster(){
		String players = "";
		for(int i = 0; i<this.teamList.size(); i++){
			players += teamList.get(i).toString() + " ";
		}
		return players;
		
		
	}
}
