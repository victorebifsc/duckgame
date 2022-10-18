package application;

public interface FlyNoWay {
	public default String fly() {
		return "Não posso voar";
	}
}
