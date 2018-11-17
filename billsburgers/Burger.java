package billsburgers;

public class Burger {

	protected String name = "Burger";
	
	protected String roll = "Bun";
	
	protected int cost = 3;

	public int getCost() {
		return cost;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(name);
		builder.append(" [bread=");
		builder.append(roll);
		builder.append(",cost=");
		builder.append(cost);
		builder.append("]");
		return builder.toString();
	}

	
}
