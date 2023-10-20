package ch06.sec15.exercise;

public class MemberService {
	String name = "hong";
	String password = "12345";
	
	boolean login(String id, String password) {
		
		if (id == this.name) {
			if (password == this.password) {
			return true;	
			}
			return false;
		} return false;
	}
		void logout(String name)	{
			if (name == this.name) {
			System.out.println( name + "님이 로그아웃 되었습니다.");
			}
		}
}