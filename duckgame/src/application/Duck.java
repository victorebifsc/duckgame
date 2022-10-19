package application;

public abstract class Duck {
	
	private QuackBehavior quackBehavior  = new QuackNormal();
	private FlyBehavior flyBehavior = new FlyNoWay();
	private SwimBehavior swimBehavior = new SwimSink();
	
	public abstract String display();
	
	public String performQuack() {
		return this.quackBehavior.quack();
	}
	public String performFly() {
		return this.flyBehavior.fly();
	}
	public String performSwim() {
		return this.swimBehavior.swim();
	}
	
	// setters
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setSwimBehavior(SwimBehavior swimBehavior) {
		this.swimBehavior = swimBehavior;
	}
	
}
