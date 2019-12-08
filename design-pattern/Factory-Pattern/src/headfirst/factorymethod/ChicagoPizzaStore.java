package headfirst.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizze();
		}else if(type.equals("veggie")) {
			//return new ChicagoStyleVeggiePizza();
			return null;
		}else {
			return null;
		}
		
	}

}
