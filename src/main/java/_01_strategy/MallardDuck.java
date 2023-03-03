package _01_strategy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack(); // MallardDuck이 꽥꽥 거리는 행동을 처리할 때는 Quack 클래스를 사용하므로 performQuack() 호출시
									 // 꽥꽥거리는 행동은 Quack 객체에게 위임된다. 결과적으로 진짜 꽥꽦 소리를 들을 수 있다.
		flyBehavior = new FlyWithWings(); // FlyBehavior 형식으로는 FlyWithWings를 사용한다.
	}

	public void display() {
		System.out.println("저는 물오리입니다.");
	}
}
