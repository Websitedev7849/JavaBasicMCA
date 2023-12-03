package GreeterPackage;

public class EveningGreeter implements Greeter {

	@Override
	public void greetUser(String userName) {
		System.out.println("Good Evening " + userName);
	}

}
