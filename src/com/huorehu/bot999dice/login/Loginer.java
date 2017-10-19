package com.huorehu.bot999dice.login;

import com.google.gson.Gson;
import com.huorehu.bot999dice.Requester;

public class Loginer {
	
	private ResponseLogin responseLogin;
    private Gson json = new Gson();
    
	private String cookies;
	
	private final String userName;
	
	public Loginer(final String userName, final String password, final String keyAPI, final Requester requester) {
		StringBuilder loginRow = new StringBuilder("a=Login&Key=");
		loginRow.append(keyAPI)
				.append("&Username=")
				.append(userName)
				.append("&Password=")
				.append(password);
		authorize(requester, loginRow.toString());
		this.userName = userName;
	}
	
	private void authorize(final Requester requester, final String loginRow) {
		responseLogin = json.fromJson(requester.request(loginRow), ResponseLogin.class);
        cookies = responseLogin.getSessionCookie();
	}
	
	public String getCookies() {
		return cookies;
	}
	
	public String getUserName() {
		return userName;
	}

}
