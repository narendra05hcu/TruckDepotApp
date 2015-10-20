package com.truckdepot.service.client;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.JerseyWebTarget;

import com.truckdepot.service.beans.UserLoginRequestSO;
import com.truckdepot.service.beans.UserLoginResponseSO;

public class JerseyClientPost {

	private static JerseyWebTarget jerseyWebTarget;

	public static void main(String[] args) {
		UserLoginRequestSO userLoginRequestSO = new UserLoginRequestSO();
		userLoginRequestSO.setUserName("test@td2.com");
		userLoginRequestSO.setPassword("india123");
		UserLoginResponseSO userLoginResponseSO = post(userLoginRequestSO,
				UserLoginResponseSO.class, "/user/login");
		System.out.println(userLoginResponseSO);

	}

	static {
		JerseyClient jerseyClient = JerseyClientBuilder.createClient();
		jerseyWebTarget = jerseyClient.target("http://localhost:8081/api/v1");
	}

	public static <T> T post(Object requestObject, Class<T> responseClass,
			String path) {
		try {

			jerseyWebTarget.path(path);

			Response response = jerseyWebTarget.request(
					MediaType.APPLICATION_JSON_TYPE).post(
					Entity.entity(requestObject,
							MediaType.APPLICATION_JSON_TYPE));

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Output from Service for path " + path
					+ " .... \n");
			T output = response.readEntity(responseClass);
			System.out.println(ToStringBuilder.reflectionToString(output));

			return output;
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}
}