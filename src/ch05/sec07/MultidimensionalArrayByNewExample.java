package ch05.sec07;

public class MultidimensionalArrayByNewExample {
	public static void main(String[] args) {
		int[][] mathScore = new int [2][3];
		
		for (int i = 0; i < mathScore.length; i++) {
			for (int j = 0; j < mathScore[i].length; j++) {
				
				System.out.println("mathScore[" + i + "][" + j + "]: " + mathScore[i][j]);
				
			}
		}
		System.out.println();
		
		mathScore[0][0] = 80;
		mathScore[0][1] = 83;
		mathScore[0][2] = 85;
		mathScore[1][0] = 86;
		mathScore[1][1] = 90;
		mathScore[1][2] = 92;
		
		int totalStudent = 0;
		int totalMathSum = 0;
		for (int i = 0; i < mathScore.length; i++) {
			totalStudent += mathScore[i].length;
			for (int j = 0; j < mathScore[i].length; j++) {
				
				totalMathSum += mathScore[i][j];
			}
		}
		double totalMathAvg = (double)totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균점수: " + totalMathAvg);
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("englishScores[" + i + "][" + j + "]: " + englishScores[i][j]);
			}
		}
		System.out.println();
		
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		
		totalStudent = 0;
		int totalEnglishSum = 0;
		for (int i = 0; i < englishScores.length; i++) {
			totalStudent += englishScores[i].length;
			for (int j = 0; j < englishScores[i].length; j++) {
				totalEnglishSum += englishScores[i][j];
			}
		}
		double totalEnglishAvg = (double)totalEnglishSum / totalStudent;
		System.out.println("전체 학생의 영어 평균점수: " + totalEnglishAvg);
	}
	

}
