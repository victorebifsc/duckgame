package application;

public interface Sink extends SwimBehavior{
	public default String swim() {
		return "Afundei";
	}
}
