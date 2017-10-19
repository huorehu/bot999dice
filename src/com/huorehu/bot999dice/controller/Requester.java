package com.huorehu.bot999dice.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Requester {

    private String url;
    private String method;
    private HttpURLConnection connection;

    public Requester(final String url, final String method) {
        this.method = method;
        this.url = url;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String request(String data) {
        String response = null;
        connection = createConnection(url);
        try {
            DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
            outputStream.writeBytes(data);
            connection.connect();
            outputStream.flush();
            outputStream.close();

            BufferedReader bfr = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            response = bfr.readLine();
            bfr.close();

        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
        return response;

    }

    private HttpURLConnection createConnection(String url) {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod(method);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestProperty("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
        return connection;
    }

}
