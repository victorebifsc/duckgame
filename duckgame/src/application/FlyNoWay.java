package application;

public interface FlyNoWay extends FlyBehavior {
	public default String fly() {
		return "Não posso voar";
	}
}
