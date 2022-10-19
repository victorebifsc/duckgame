package application;

public class RubberDuck extends Duck {

	@Override
	public String display() {
		return "Pato de bolacha";
	}
	
	public RubberDuck() {
		setQuackBehavior(new QuackSqueak());
		setFlyBehavior(new FlyNoWay());
		setSwimBehavior(new SwimFloat());
	}

}
