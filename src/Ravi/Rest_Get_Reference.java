package Ravi;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Rest_Get_Reference {

	public static void main(String[] args) {
		//  declare baseURl
		RestAssured.baseURI="https://reqres.in/";
		
		//declare requestbody
		
		//declare given,when.then
		String responseBody=given().header("Content-Type","Application/json")
				.when().get("api/users?page=2").then().log().all().extract().response().asString();
			
	

	}

}
