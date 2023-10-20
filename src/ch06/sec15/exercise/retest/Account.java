package ch06.sec15.exercise.retest;

public class Account {
	private String ano;
	private String name;
	private int money;
	
	Account(String ano, String name, int money) {
		this.ano = ano;
		this.name = name;
		this.money = money;
		
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
