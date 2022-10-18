package application;

public class RedHeadDuck extends Duck implements FlyWithWings, Swimable, Quackable{
	
	@Override
	public String display() {
		return "¡Hola, jo soy un pato red dead redemption!";
	}

	@Override
	public String quack() {
		return "Quacke?";
	}

	@Override
	public String swim() {
		return "Nadando";
	}

}
