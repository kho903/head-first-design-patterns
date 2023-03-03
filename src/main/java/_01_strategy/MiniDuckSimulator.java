package _01_strategy;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		// MallardDuck 에서 상속받은 performQuack(), performFly() 메소드가 호출된다.
		// 이 메소드에서는 객체의 QuackBehavior, FlyBehavior에게 할 일을 위임한다.
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly(); // performFly() 처음 호출시 ModelDuck 생성자에서 설정되었떤 flyBehavior,
							// 즉, flyNoWay 인스턴스의 fly() 메소드가 호출된다.
		model.setFlyBehavior(new FlyRocketPowered()); // 상속받은 행동 세터 메소드가 호출된다.
													  // 이제 모형 오리에 로켓 추진력으로 날 수 있는 능력이 생겼다.
		model.performFly(); // 제대로 돌아간다면 모형 오리는 동적으로 나는 행동을 바꿀 수 있다.
							// 구현 코드가 Duck 클래스 안에 들어있다면 그렇게 할 수 없었다.

	}
}
