package application;

public class DecoyDuck extends Duck {

	@Override
	public String display() {
		return "Soy d maderakk";
	}
	
	public DecoyDuck() {
		setQuackBehavior(new QuackMute());
		setFlyBehavior(new FlyNoWay());
		setSwimBehavior(new SwimSink());
	}

}
