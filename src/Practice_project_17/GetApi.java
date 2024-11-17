package Practice_project_17;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetApi {
    @Test
    public void testGetRequest() {

        RestAssured.baseURI = "https://postman-echo.com";


        Response response = given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .extract().response();


        System.out.println("Response Headers: " + response.getHeaders());
        System.out.println("Response Body: " + response.asString());
        System.out.println("Response Content-Type: " + response.getContentType());


        Assertions.assertEquals("bar1", response.jsonPath().getString("args.foo1"), "Значение foo1 не совпадает");
        Assertions.assertEquals("bar2", response.jsonPath().getString("args.foo2"), "Значение foo2 не совпадает");
    }
}
