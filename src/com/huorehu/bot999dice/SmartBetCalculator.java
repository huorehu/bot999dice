package com.huorehu.bot999dice;

public class SmartBetCalculator {
	
	public long getNextBet(Strategy strategy) {
		return strategy.calculateNextBet();
	}

}
