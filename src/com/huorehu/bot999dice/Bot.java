package com.huorehu.bot999dice;

public class Bot {
	
	private static final String URL = "https://www.999dice.com/api/web.aspx";
    private static final String METHOD = "POST";
	
	private Loginer loginer;
	private Strategy strategy;
	private Requester requester;
	
	public Bot(Strategy strategy, final String userName, final String password, final String keyAPI) {
		this.loginer = new Loginer(userName, password, keyAPI);
		this.strategy = strategy;
		requester = new Requester(URL, METHOD);
	}
	
	public void start() {
		
	}

}
