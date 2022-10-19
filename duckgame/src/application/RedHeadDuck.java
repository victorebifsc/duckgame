package application;

public class RedHeadDuck extends Duck {
	
	@Override
	public String display() {
		return "¡Hola, jo soy un pato red dead redemption!";
	}
	
	public RedHeadDuck() {
		setQuackBehavior(new QuackNormal());
		setFlyBehavior(new FlyWithWings());
		setSwimBehavior(new SwimAble());
	}

}
