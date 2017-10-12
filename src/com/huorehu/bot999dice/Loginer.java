package com.huorehu.bot999dice;

import com.google.gson.Gson;

public class Loginer {
	
	private ResponseLogin responseLogin;
    private Gson json = new Gson();
    
	private String cookies;
	
	private final String userName;
	
	private final String loginRow;
	
	public Loginer(final String userName, final String password, final String keyAPI) {
		StringBuilder loginRow = new StringBuilder("a=Login&Key=");
		loginRow.append(keyAPI)
				.append("&Username=")
				.append(userName)
				.append("&Password=")
				.append(password);
		this.loginRow = loginRow.toString();
		this.userName = userName;
	}
	
	public void authorize(Requester requester) {
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
