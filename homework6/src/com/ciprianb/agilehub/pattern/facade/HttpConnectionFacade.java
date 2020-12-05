package com.ciprianb.agilehub.pattern.facade;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

import com.ciprianb.agilehub.pattern.bad.HttpConnectionHandler;

public class HttpConnectionFacade {

	private final HttpConnectionHandler httpConnectionHandler;

	public HttpConnectionFacade(URL url) {
		httpConnectionHandler = new HttpConnectionHandler(url);
	}

	public Optional<String> sendPostBody(String body) {
		return sendBody("POST", body);
	}

	public Optional<String> sendBody(String requestMethod, String body) {
		if(requestMethod == null || body == null)
			return Optional.empty();
		HttpURLConnection connection = null;
		try {
			connection = httpConnectionHandler.createConnection();
			return httpConnectionHandler.sendBody(connection, requestMethod, body);
		} catch (IOException e) {
			System.err.println("Error when send body");
			e.printStackTrace();
			return Optional.empty();
		} finally {
			if(connection != null)
				connection.disconnect();
		}
	}
}
