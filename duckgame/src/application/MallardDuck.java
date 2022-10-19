package application;

public class MallardDuck extends Duck {

	@Override
	public String display() {
		return "¡Hola, jo soy un pato mallard!";
	}
	
	public MallardDuck() {
		setQuackBehavior(new QuackNormal());
		setFlyBehavior(new FlyWithWings());
		setSwimBehavior(new SwimAble());
	}

}
