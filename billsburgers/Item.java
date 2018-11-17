package billsburgers;

public class Item {

	public static final Item LETTUCE = new Item("Lettuce",1);
	public static final Item TOMATO = new Item("Tomato",2);
	public static final Item CARROT = new Item("Carrot",3);


	private final String name;
	private final int cost;
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [name=");
		builder.append(name);
		builder.append(", cost=");
		builder.append(cost);
		builder.append("]");
		return builder.toString();
	}

	public String getName() { return this.name; }
	public int getCost() { return this.cost; }

	Item(String name, int cost) { this.name = name; this.cost = cost; }

}
