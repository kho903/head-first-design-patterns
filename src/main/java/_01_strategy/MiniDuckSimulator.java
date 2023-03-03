package _01_strategy;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		// MallardDuck 에서 상속받은 performQuack(), performFly() 메소드가 호출된다.
		// 이 메소드에서는 객체의 QuackBehavior, FlyBehavior에게 할 일을 위임한다.
		mallard.performQuack();
		mallard.performFly();
	}
}
