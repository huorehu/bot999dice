package com.huorehu.bot999dice.strategy;

public class MyStrategy implements Strategy {

	@Override
	public Bet calculateNextBet(Bet lastBet) {
		return lastBet;
	}

}
