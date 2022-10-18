package application;

public class RedHeadDuck extends Duck implements FlyWithWings, SwimAble, Quack{
	
	@Override
	public String display() {
		return "¡Hola, jo soy un pato red dead redemption!";
	}

}
