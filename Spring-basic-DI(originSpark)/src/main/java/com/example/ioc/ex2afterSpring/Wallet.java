package com.example.ioc.ex2afterSpring;
//Mutable class. VO
public class Wallet {
	
	private int money;
	
	public Wallet() {
		
	}

	public Wallet(int money) {
		this.money = money;
	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}