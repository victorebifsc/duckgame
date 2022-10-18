package application;

public class RubberDuck extends Duck implements Quackable, Swimable{

	@Override
	public String swim() {
		return "Nadando";
	}

	@Override
	public String quack() {
		return "Very Quick";
	}

	@Override
	public String display() {
		return "Pato de bolacha";
	}

}
