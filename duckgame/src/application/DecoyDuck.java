package application;

public class DecoyDuck extends Duck implements Sink, MuteQuack, FlyNoWay {

	@Override
	public String display() {
		return "Soy d maderakk";
	}

}
