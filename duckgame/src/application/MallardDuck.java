package application;

public class MallardDuck extends Duck implements FlyWithWings, SwimAble, Quack {

	@Override
	public String display() {
		return "¡Hola, jo soy un pato mallard!";
	}

}
