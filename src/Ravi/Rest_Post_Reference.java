package Ravi;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class Rest_Post_Reference {

	public static void main(String[] args) {
	//Declare base URL
	RestAssured.baseURI="https://reqres.in/";
	//Declare the request body string variable
	String requestbody="{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"leader\"\r\n"
			+ "}";
	//Declare given,when and then method
	String responseBody=given().header("Content-Type","application/json").body(requestbody)
		  .when().post("https://reqres.in/api/users").then(). extract().response().asString();
	System.out.println(responseBody);

	}

}
