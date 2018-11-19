package GenericsExample.SportsTeamLeague;

import java.util.ArrayList;
import java.util.List;

public class SportsTeamLeague<T extends SportsTeam> {

	private final List<T> teams = new ArrayList<>();
	
	public boolean addTeam(T team) {
		
		if (!teams.contains(team)) {
			teams.add(team);
			return true;
		} else {
			return false;
		}
	}
	
	public void printTeamsByRanking() {
		teams.stream().sorted().forEach(t -> System.out.println(t));
	}
	
	
	public static void main(String[] args) {

		SportsTeamLeague<FootballTeam> football = new SportsTeamLeague<>();
		football.addTeam(new FootballTeam("49ers", 1));
		football.addTeam(new FootballTeam("Cowboys", 5));
		football.addTeam(new FootballTeam("Dolphins", 7));
		football.addTeam(new FootballTeam("Steelers", 3));
		football.addTeam(new FootballTeam("Oilers", 4));
		football.addTeam(new FootballTeam("Bears", 2));
		
		
		SportsTeamLeague<BaseballTeam> baseball = new SportsTeamLeague<>();
		baseball.addTeam(new BaseballTeam("Marilns", 1));
		baseball.addTeam(new BaseballTeam("White Sox", 5));
		baseball.addTeam(new BaseballTeam("Red Sox", 7));
		baseball.addTeam(new BaseballTeam("Yankees", 3));
		football.addTeam(new FootballTeam("Cubs", 4));
		
		football.printTeamsByRanking();
		System.out.println("=======================================");
		baseball.printTeamsByRanking();
	}
}
