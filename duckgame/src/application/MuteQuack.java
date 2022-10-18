package application;

public interface MuteQuack extends QuackBehavior{
	public default String quack() {
		return "Não faço quack";
	}
}
