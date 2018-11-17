package billsburgers;

public class BurgerPurchasing {


	public BurgerOrder selectBurger(String name, Burger burger) {

		return new BurgerOrder(name,burger);
	}

}
