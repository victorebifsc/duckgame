package application;

public interface Squeak extends QuackBehavior {
	public default String quack() {
		return "Squeak";
	}
}
