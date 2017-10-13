package com.huorehu.bot999dice;

import com.google.gson.annotations.SerializedName;

public class ResponseBet {
	
	@SerializedName("StartingBalance")
    private long balanceBeforeBet;

    @SerializedName("PayOut")
    private int win;

    public int getWin() {
        return win / 2;
    }

    public long getBalanceBeforeBet() {
        return balanceBeforeBet;
    }

    public long getCurrentBalance() {
        if (getWin() == 0) {
            return balanceBeforeBet - getWin();
        } else {
            return balanceBeforeBet + getWin();
        }

    }

}
