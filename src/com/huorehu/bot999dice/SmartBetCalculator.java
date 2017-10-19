package com.huorehu.bot999dice;

import com.huorehu.bot999dice.strategy.Strategy;

public class SmartBetCalculator {
	
	public long getNextBet(Strategy strategy) {
		return strategy.calculateNextBet();
	}

}
