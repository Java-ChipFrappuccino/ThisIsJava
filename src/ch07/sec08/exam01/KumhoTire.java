package ch07.sec08.exam01;

public class KumhoTire extends Tire {
	@Override
	public void roll() {
		super.roll();
		System.out.println("사막에서 특화되었습니다.");
	}

}
