package application;

public interface MuteQuack extends QuackBehavior{
	public default String quack() {
		return "N�o fa�o quack";
	}
}
