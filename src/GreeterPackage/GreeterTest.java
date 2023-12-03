package GreeterPackage;

public class GreeterTest {

	public static void main(String[] args) {
		Greeter morningGreeter = new MorningGreeter();
		Greeter eveningGreeter = new EveningGreeter();
		
		morningGreeter.greetUser("Steve");
		eveningGreeter.greetUser("Virat");

	}

}
