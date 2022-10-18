package application;

public interface Float extends SwimBehavior {
	public default String swim() {
		return "Estou boiando";
	}
}
