package GreeterPackage;

public class MorningGreeter implements Greeter {

	@Override
	public void greetUser(String userName) {
		System.out.println("Good Morning " + userName);
	}

}
