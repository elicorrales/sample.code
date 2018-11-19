package GenericsExample.SportsTeamLeague;

public abstract class SportsTeam<T> implements Comparable<T> {

	private final String name;
	private int ranking;
	private final String type;
	
	protected SportsTeam(String name, String type, int ranking) {
		this.name = name;
		this.ranking = ranking;
		this.type = type;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(T t) {
		
		if (this.ranking>((SportsTeam<?>)t).ranking) return 1;
		else if (this.ranking<((SportsTeam<?>)t).ranking) return -1;
		return 0;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SportsTeam [name=");
		builder.append(name);
		builder.append(", ranking=");
		builder.append(ranking);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}

}
