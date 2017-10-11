package com.huorehu.bot999dice;

import com.google.gson.Gson;

public class Loginer {
	
	private ResponseLogin responseLogin;
    private Gson json = new Gson();
    
	private String cookies;
	
	private final String userName = "test@ccount";
	private final String password = "24zem37kf5";
	private final String keyAPI = " 44d37bfbbcbb4d0cb1aef54553f1d1f4";
	
	private final String loginRow;
	
	public Loginer() {
		StringBuilder loginRow = new StringBuilder("a=Login&Key=");
		loginRow.append(this.keyAPI)
				.append("&Username=")
				.append(this.userName)
				.append("&Password=")
				.append(this.password);
		this.loginRow = loginRow.toString();
	}
	
	public void authorize(Requester requester) {
		responseLogin = json.fromJson(requester.request(loginRow), ResponseLogin.class);
        cookies = responseLogin.getSessionCookie();
	}
	
	public String getCookies() {
		return cookies;
	}

}
