package application;

public interface FlyWithWings extends FlyBehavior{
	public default String fly() {
		return "Estou voando";
	}
}
