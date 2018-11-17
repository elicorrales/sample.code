package billsburgers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BurgerOrder {

	private final String name;
	private final Burger burger;
	private Map<String,Item> items = new HashMap<String,Item>();
	private int basePrice;
	private int addedCost = 0;
	
	BurgerOrder(String name, Burger burger) {
		this.name = name;
		this.burger = burger;
		this.basePrice = burger.getCost();
	}
	
	public void addItem(Item item) {
		this.items.put(item.getName(),item);
	}


	public void removeItem(Item item) {
		this.items.remove(item.getName());
	}


	public int getPrice() { 
		this.addedCost = 0;
		for (Item i:items.values()) addedCost += i.getCost();
		return this.basePrice + addedCost;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BurgerOrder [name=");
		builder.append(name);
		builder.append(", burger=");
		builder.append(burger);
		builder.append(", total=");
		builder.append(getPrice());
		builder.append("[");
		for (Item i:items.values()) builder.append(i.getName()+",");
		builder.append("]");
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
