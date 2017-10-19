package com.huorehu.bot999dice.login;

import com.google.gson.annotations.SerializedName;

public class ResponseLogin {
	
	@SerializedName("SessionCookie")
    private String sessionCookie;

    @SerializedName("Balance")
    private int balance;

    public String getSessionCookie() {
        return sessionCookie;
    }

    public int getbalance() {
        return balance;
    }

}
