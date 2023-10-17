package ch04.sec03;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재 시간 : " + time + "시]");
		
		switch (time) {
		case 8:
			System.out.println("출근준비");
//			break;
		case 9:
			System.out.println("회의시간");
//			break;
		case 10:
			System.out.println("업무시간");
//			break;
		default:
			System.out.println("점심시간");
		}
	}

}
