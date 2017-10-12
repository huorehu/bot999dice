package com.huorehu.bot999dice;

public class Main {
	
	private static final String USER_NAME = "test@ccount";
	private static final String PASSWORD = "24zem37kf5";
	private static final String KEY_API = " 44d37bfbbcbb4d0cb1aef54553f1d1f4";
	
	public static void main(String[] args) {
		Strategy strategy = new MyStrategy();
		Bot bot = new Bot(strategy, USER_NAME, PASSWORD, KEY_API);
	}

}
