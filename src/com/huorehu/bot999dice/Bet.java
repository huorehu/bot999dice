package com.huorehu.bot999dice;

public class Bet {
	
	private StringBuilder betRequest;
	
    private final String first = "a=PlaceBet&s=";
    private String cookies;
    private final String second = "&PayIn=";
    private long bet;
    private final String third = "&Low=";
    private int lowBound = 0;
    private final String fourth = "&High=";
    private int highBound = 949999;
    private final String fifth = "&ClientSeed=";
    private int clientSeed;
    private final String sixth = "&Currency=btc";
    
    public Bet() {
    	
    }
    
    public void setBet(final int bet) {
    	this.bet = bet;
    }
    
    public String getBetRequest() {
    	return betRequest.toString();
    }

}
