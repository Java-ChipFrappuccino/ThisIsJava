package ch05.sec06;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		String[] season = {"spring", "summer", "fall", "winter"};
		
		System.out.println("season1: " + season[0]);
		System.out.println("season2: " + season[1]);
		System.out.println("season3: " + season[2]);
		System.out.println("season4: " + season[3]);
		
		season[1] = "여름";
		System.out.println("season2: " + season[1]);
		System.out.println();
		
		int[] scores = {83,90,87};
		int all = 0;
		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			all += scores[i];
		}
		System.out.println("총합: " + all);
		double avr = (double)all / scores.length;
		System.out.printf("평균점수는 %3.1f 점 입니다." , avr);
	}

}
