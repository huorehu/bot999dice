package com.huorehu.bot999dice;

import com.huorehu.bot999dice.strategy.Bet;
import com.huorehu.bot999dice.strategy.Strategy;

public class SmartBetCalculator {
	
	public Bet getNextBet(Strategy strategy) {
		return strategy.calculateNextBet(null);
	}

}
