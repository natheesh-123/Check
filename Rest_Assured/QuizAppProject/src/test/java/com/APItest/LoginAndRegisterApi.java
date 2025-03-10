package com.APItest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

 


public class LoginAndRegisterApi {
	@Test 
	public void GET_LOGIN() {
	Response response = get("http://quiz-fe.hematitecorp.com/");
	
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	System.out.println(response.getHeader("User-Agent"));
	System.out.println(response.getHeader("Host"));
	System.out.println(response.getHeader("Connection"));
	
	int statusCode = response.getStatusCode();
	
	Assert.assertEquals(statusCode, 200);  

	}
	@Test
	public void testPost() 
	{
	
	 
	Map<String, Object> map = new HashMap<String, Object>();
	
//	map.put("name", "Monica");
//	map.put("job", "Trainer");
//	
//	System.out.println(map);
	
	JSONObject request = new JSONObject(map);
	
	request.put("fname", "Ravi");
	request.put("lname", "kummar");
	request.put("contact", "9080049177");
	request.put("email", "user1@gmail.com");
	request.put("gender", "male");
	request.put("role", "student");
	
	System.out.println(request.toJSONString());
	
	baseURI = "http://quiz-be-test.hematitecorp.com";
	
	given().
	header("Content-Type", "application/json").//you should know header of your json response.
	contentType(ContentType.JSON).accept(ContentType.JSON). //explicitly telling to server that my content type is json
	body(request.toJSONString()).
	post("/api/user/").then().statusCode(200).log().all();

}
	@Test
	public void testPut()
	{
		baseURI = "http://quiz-be-test.hematitecorp.com";
		 
		// First, log in to retrieve the token
		String loginPayload = "{\r\n"
				+ "  \"email\": \"admin@gmail.com\",\r\n"
				+ "  \"password\": \"Admin@1234\"\r\n"
				+ "}";
 
		// Send the POST request to get the token
		Response loginResponse = given().
				header("Content-Type", "application/json").
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				body(loginPayload).
				post("/api/token/");
 
		// Print response to verify token retrieval in case of an error
		loginResponse.prettyPrint();
 
		// Extract the token from the response JSON - adjust "token" based on actual response structure
		String token = loginResponse.jsonPath().getString("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbl90eXBlIjoiYWNjZXNzIiwiZXhwIjoxNzMxNTA1NDcyLCJpYXQiOjE3MzE0ODk4NzIsImp0aSI6ImMwM2M2YzI1Y2M1YTRlZGU5YjU4Mjk3Y2M1MDI1MTFlIiwidXNlcl9pZCI6Mn0.ciV9UII7uh5TYtRMOH-_NooohAqOp1TDpbCqfG38TX4");  // Change "token" to actual key name in response
 
		if (token == null || token.isEmpty()) {
			System.out.println("Failed to retrieve token. Please check login credentials and API response structure.");
			return;
		}
		
	}
		@Test
		public void testDelete() {
			
			//for delete we don't require body
			
			baseURI = "https://reqres.in";
			
			when().
			delete("/api/users?page=2").then().statusCode(204).log().all();
	}
		
		public void test_1() {
			
			//	Response response = RestAssured.get("http://quiz-be-test.hematitecorp.com/api/enroll/");  //when import in Static way then we don't require RestAssured function so we have removed it in below line.
				
				Response response = get("http://quiz-be-test.hematitecorp.com/api/user/");
				
				System.out.println(response.getStatusCode());
				System.out.println(response.getTime());
				System.out.println(response.getBody().asString());
				System.out.println(response.getStatusLine());
				System.out.println(response.getHeader("content-type"));
				
				int statusCode = response.getStatusCode();
				
				Assert.assertEquals(statusCode, 200);
			}
			
			@Test
			public void test_2() {
				
				baseURI = "http://quiz-be-test.hematitecorp.com";
				given().get("/api/user/").then().statusCode(200).body("data[2].id", equalTo(17)).log().all();
				
				
				given().get("/api/user/").then().statusCode(200).body("data[105].email", equalTo("loki@gmail.com")).log().all();
					
			}
			
			private ResponseAwareMatcher<Response> equalTo(String string) {
				// TODO Auto-generated method stub
				return null;
			}
			private ResponseAwareMatcher<Response> equalTo(int i) {
				// TODO Auto-generated method stub
				return null;
			}
		
}
