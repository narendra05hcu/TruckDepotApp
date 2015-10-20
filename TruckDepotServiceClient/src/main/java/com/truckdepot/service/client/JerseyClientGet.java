package com.truckdepot.service.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.core.MediaType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.JerseyWebTarget;

import com.truckdepot.service.beans.SearchLoadResponseSO;
import com.truckdepot.service.beans.UserLoginRequestSO;

public class JerseyClientGet {

	private static JerseyWebTarget jerseyWebTarget;

	public static void main(String[] args) {
		UserLoginRequestSO userLoginRequestSO = new UserLoginRequestSO();
		userLoginRequestSO.setUserName("test@td2.com");
		userLoginRequestSO.setPassword("india123");
		Map<String, Object> requestParams = new HashMap<String, Object>();
		requestParams.put("fromCity", "Hyderabad");
		requestParams.put("toCity", "Chennai");
		requestParams.put("availableDate", "5-10-2015");
		SearchLoadResponseSO searchLoadResponseSO = get(requestParams,
				SearchLoadResponseSO.class, "/search/load");
		System.out.println(ToStringBuilder.reflectionToString(searchLoadResponseSO));

	}

	static {
		JerseyClient jerseyClient = JerseyClientBuilder.createClient();
		jerseyWebTarget = jerseyClient.target("http://localhost:8081/api/v1");
	}

	public static <T> T get(Map<String, Object> requestParams,
			Class<T> responseClass, String path) {
		try {
			jerseyWebTarget = jerseyWebTarget.path(path);
			for (Entry<String, Object> param : requestParams.entrySet()) {
				jerseyWebTarget = jerseyWebTarget.queryParam(param.getKey(),
						param.getValue());
			}
			T response = jerseyWebTarget.request(
					MediaType.APPLICATION_JSON_TYPE).get(responseClass);
			return response;
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}
}