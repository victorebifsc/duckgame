package application;

public interface Quack extends QuackBehavior{
	public default String quack() {
		return "Quack";
	}
}
