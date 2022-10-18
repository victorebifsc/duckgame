package application;

public interface SwimAble extends SwimBehavior{
	public default String swim() {
		return "Estou nadando";
	}
}
