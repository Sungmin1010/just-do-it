package headfirst.factorymethod;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	void preapre() {
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println();
	}
	
	void bake() {
		System.out.println("Bake for 25 minute at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStrog box");
	}
	
	public String getName() {
		return name;
	}

}
