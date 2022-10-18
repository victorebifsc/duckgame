package application;

public class MallardDuck extends Duck implements Flyable, Swimable, Quackable {

	@Override
	public String display() {
		return "¡Hola, jo soy un pato mallard!";
	}

	@Override
	public String quack() {
		return "Quack!";
	}

	@Override
	public String swim() {
		return "Mallard a nadar";
	}
		 	
	@Override
	public String fly() {
		return "Sto a vuar";
	}
	
}
