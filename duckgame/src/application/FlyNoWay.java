package application;

public interface FlyNoWay extends FlyBehavior {
	public default String fly() {
		return "N�o posso voar";
	}
}
