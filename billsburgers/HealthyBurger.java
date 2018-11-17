package billsburgers;

public class HealthyBurger extends Burger {

	HealthyBurger() {
		super.name = "Healthy";
		super.roll = "Wheat Bun";
		super.cost = super.cost+1;
	}
}
