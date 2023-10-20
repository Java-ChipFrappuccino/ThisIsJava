package ch06.sec15.exercise;

public class Singletone {
	private static Singletone singletone = new Singletone();
	private Singletone() {
		
	}
	public static Singletone only() {
		return singletone;
	}
}
