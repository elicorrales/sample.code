package GenericsExample.SportsTeamLeague;

public class FootballTeam extends SportsTeam {

	protected FootballTeam(String name, int ranking) {
		super(name, FootballTeam.class.getSimpleName() , ranking);
	}

}
