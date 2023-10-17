package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		
		scores = new int[] { 83,90, 87};
		
		int all = 0;
		for (int i = 0; i < scores.length; i++) {
			all += scores[i];
		}
		System.out.println("총합: " + all);
		printItem( new int[] {55,64,35} );
	}
	
	public static void printItem( int[] scores ) {
		for (int i = 0; i < scores.length; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
		
	}
}
