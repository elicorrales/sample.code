package GenericsExample.SportsTeamLeague;

public class BaseballTeam extends SportsTeam {

	protected BaseballTeam(String name, int ranking) {
		super(name, BaseballTeam.class.getSimpleName() , ranking);
	}


}
