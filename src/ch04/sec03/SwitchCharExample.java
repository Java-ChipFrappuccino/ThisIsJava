package ch04.sec03;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'a';
				
		switch(grade) {
		  case 'A','a':
//		  case 'a':
			System.out.println("우수회원");
			break;
		  case 'B':
		  case 'b':
			System.out.println("일반회원");
	        break;
	      default:
	    	System.out.println("손님");
		}
	}

}
