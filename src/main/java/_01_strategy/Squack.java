package _01_strategy;

public class Squack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("삑");
	}
}
