package com.huorehu.bot999dice;

public class Bot {
	
	private Loginer loginer;
	private Strategy strategy;
	
	public Bot(Strategy strategy, final String userName, final String password, final String keyAPI) {
		this.loginer = new Loginer(userName, password, keyAPI);
		this.strategy = strategy;
	}

}
