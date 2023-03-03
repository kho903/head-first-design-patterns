package _01_strategy;

public abstract class Duck {
	// 행동 인터페이스 형식의 레퍼런스 변수 2개 선언
	// 같은 패키지에 속하는 모든 서브클래스에서 이 변수를 상속 받는다.
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() { }

	public void performFly() {
		flyBehavior.fly(); // 행동 클래스에 위임
	}

	public void performQuack() {
		quackBehavior.quack(); // 행동 클래스에 위임
	}

	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
