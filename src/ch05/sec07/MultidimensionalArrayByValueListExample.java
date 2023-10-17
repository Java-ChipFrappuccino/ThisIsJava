package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		int[][] scores = {
				{ 80, 90 , 96 },
				{ 76, 88 }
		};
		
		System.out.println("1차원 배열길이 (반의 수): " + scores.length);
		System.out.println("2차원 배열길이 (첫번째 반의 학생수): " + scores[0].length);
		System.out.println("2차원 배열길이 (두번째 반의 학생수): " + scores[1].length);
		
		//첫번째 반의 3번째 학생 점수
		System.out.println("scores[0][2]: " + scores[0][2]);
		//2번째 반의 2번째 학생 점수
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		//첫번째 반의 평균점수 
		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double)class1Sum / scores[0].length;
		System.out.printf("첫번째 반의 평균점수: %3.1f\n" , class1Avg);
//		System.out.println("첫번째 반의 평균점수: " + class1Avg);
		
		//두번째 반의 평균점수 
		int class2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double)class2Sum / scores[1].length;
		System.out.printf("두번째 반의 평균점수: %3.1f\n" , class2Avg);
//		System.out.println("두번째 반의 평균점수: " + class1Avg);
		
		//전체 학생의 평균점수
		int totalStudent = 0;
		int totalSum = 0;
		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;
			for (int k = 0; k < scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		double totalAvr = (double)totalSum / totalStudent;
		System.out.printf("전교생은 " + totalStudent + "명 이고, 평균점수는 %3.1f점 입니다.\n" , totalAvr);
	}

}
