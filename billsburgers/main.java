package billsburgers;

public class main {

	public main() {
		
		BurgerPurchasing purchasing = new BurgerPurchasing();
		

		String name = "John";
		
		//john orders a basic burger
		BurgerOrder basic = purchasing.selectBurger(name,new Burger());
		System.out.println(basic);

		basic.addItem(Item.LETTUCE);
		System.out.println(basic);

		basic.addItem(Item.TOMATO);
		System.out.println(basic);

		basic.addItem(Item.CARROT);
		System.out.println(basic);
		
		
		System.out.println("------------------------");

		name = "Jill";
		
		//john orders a basic burger
		BurgerOrder healthy = purchasing.selectBurger(name,new HealthyBurger());
		System.out.println(healthy);

		healthy.addItem(Item.LETTUCE);
		System.out.println(healthy);

		healthy.addItem(Item.TOMATO);
		System.out.println(healthy);

		healthy.addItem(Item.CARROT);
		System.out.println(healthy);
		
		healthy.removeItem(Item.CARROT);
		System.out.println(healthy);
		
	}

	public static void main(String[] args) {
		
		new main();
	}
}
