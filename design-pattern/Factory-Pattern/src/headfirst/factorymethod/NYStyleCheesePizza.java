package headfirst.factorymethod;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "Newyork style cheese pizza";
		dough = "ny dough";
		sauce = "ny sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}

}
