package API_testing;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class GetRequestDemo {

    public static void main(String[] args) {

        // Base URI
        RestAssured.baseURI = "https://gorest.co.in/";

//        System.out.println("============== GET REQUEST ==============");
//
//        // GET Request
//        Response getResponse =given().when().get("/public/v2/users/8052292");
//
//        // Print Response
//        System.out.println("Status Code : "
//                + getResponse.getStatusCode());
//
//        System.out.println("Response Body : ");
//        System.out.println(getResponse.getBody().asString());
//
//        System.out.println("Response Time : "
//                + getResponse.getTime());
//
//        System.out.println("Content Type : "
//                + getResponse.getContentType());
//
//
//
//        System.out.println("\n============== VALIDATIONS ==============");
//
//        // Validations
//        given().when().get("/public/v2/users/8052292").then().statusCode(200).body("status", equalTo("active"))
//        .header("Content-Type",
//                containsString("application/json"))
//
//        .log().all();
//        
//        System.out.println("\n============== JSON EXTRACTION ==============");
//
//        // JSON Extraction
//        JsonPath jsonPath =
//                getResponse.jsonPath();
//
//        int id =
//                jsonPath.getInt("id");
//        String name =
//                jsonPath.getString("name");
//
//        String email =
//                jsonPath.getString("email");
//
//        String gender =
//                jsonPath.getString("gender");
//        String status =
//                jsonPath.getString("status");
//
//        System.out.println("ID : " + id);
//
//        System.out.println("name : " + name);
//        System.out.println("Email : " + email);
//        System.out.println("gender : " + gender);
//        System.out.println("status : " + status);
//
//        System.out.println(" Name : "+name);
               
//        System.out.println("\n============== POST REQUEST ==============");
//        
//	 	// Request Body
//	    String postRequestBody = "{ "
//	            + "\"user_id\":8477478,"
//	            + "\"title\":\"API Testing with RestAssured\","
//	            + "\"body\":\"This is my first post created using RestAssured POST request.\""
//	            + "}";
// 
	    // Bearer Token
	    String token = "889ce20164d31703dcf6393373fa9e59221270c60d0b3c5aecbd063025d38373";
 
//	    // POST Request
//	    Response postResponse =
//	            given()
//	                .header("Authorization", "Bearer " + token)
//	                .contentType(ContentType.JSON)
//	                .body(postRequestBody)
//	            .when()
//	                .post("/public/v2/posts");
// 
//	    // Print Response
//	    System.out.println("Status Code : " + postResponse.getStatusCode());
//	    System.out.println("Response Body : ");
//	    System.out.println(postResponse.getBody().asString());
// 
//
//     // Validation
//     postResponse.then()
//
//             .statusCode(201)
//
//             .log().all();

    
        
       

      //  System.out.println("\n============== PUT REQUEST ==============");

  // PUT Request Body
  

     String putRequestBody =
             "{ \"name\":\"Vaishali Sonawane\", " +
             "\"email\":\"vaishali" + System.currentTimeMillis() + "@gmail.com\", " +
             "\"gender\":\"female\", " +
             "\"status\":\"active\" }";

     Response putResponse =

             given()

                     .header("Authorization", "Bearer " + token)

                     .contentType(ContentType.JSON)

                     .body(putRequestBody)

             .when()

                     .put("/public/v2/users/8052294");

     putResponse.then()

             .statusCode(200)

             .log().all();



//        System.out.println("\n============== DELETE REQUEST ==============");
//
//        // DELETE Request
//        given()
//
//        .when()
//
//            .delete("/api/users/2")
//
//        .then()
//
//            .statusCode(204)
//
//            .log().all();



//        System.out.println("\n============== PATH PARAMETER ==============");
//
//        // Path Parameter
//        given()
//
//            .pathParam("id", 2)
//
//        .when()
//
//            .get("/api/users/{id}")
//
//        .then()
//
//            .statusCode(200)
//
//            .log().all();
//
//
//
//        System.out.println("\n============== QUERY PARAMETER ==============");
//
//        // Query Parameter
//        given()
//
//            .queryParam("page", 2)
//
//        .when()
//
//            .get("/api/users")
//
//        .then()
//
//            .statusCode(200)
//
//            .log().all();
//
//
//
//        System.out.println("\n============== HEADERS ==============");
//
//        // Headers Example
//        given()
//
//            .header("Content-Type",
//                    "application/json")
//
//        .when()
//
//            .get("/api/users/2")
//
//        .then()
//
//            .statusCode(200)
//
//            .log().headers();
//
//
//
        
//
//
//        System.out.println("\n============== REQUEST CHAINING ==============");
//
//        // POST Request
//        Response chainResponse =
//
//                given()
//
//                    .contentType(ContentType.JSON)
//
//                    .body(postRequestBody)
//
//                .when()
//
//                    .post("/api/users");
//
//        // Extract ID
//        String chainId =
//                chainResponse.jsonPath().getString("id");
//
//        System.out.println("Chain ID : "
//                + chainId);
//
//        // GET using same ID
//        given()
//
//            .pathParam("id", chainId)
//
//        .when()
//
//            .get("/api/users/{id}")
//
//        .then()
//
//            .log().all();
//
//
//
//        System.out.println("\n============== JSON SCHEMA VALIDATION ==============");
//
//        // Schema Validation
//        given()
//
//        .when()
//
//            .get("/api/users/2")
//
//        .then()
//
//            .assertThat()
//
//            .body(matchesJsonSchemaInClasspath(
//                    "schema.json"))
//
//            .log().all();
//
//
//
//        System.out.println("\n============== PRINT HEADERS ==============");
//
//        // Print Headers
//        getResponse.getHeaders().forEach(
//                System.out::println);
//
//
//
//        System.out.println("\n============== PRINT COOKIES ==============");
//
//        // Print Cookies
//        getResponse.getCookies().forEach(
//                (k,v) -> System.out.println(
//                        k + " : " + v));
//
//
//
//        System.out.println("\n============== TEST COMPLETED ==============");
    }
}