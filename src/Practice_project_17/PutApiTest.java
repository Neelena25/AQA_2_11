package Practice_project_17;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class PutApiTest {
    @Test
    public void testPutRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        String requestBody = "{\"data\": \"This is expected to be sent back as part of response body.\"}"; // данные для PUT

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/put")
                .then()
                .extract().response();

        Assertions.assertEquals(200, response.getStatusCode(), "Response status code is not 200");

        Assertions.assertEquals("This is expected to be sent back as part of response body.",
                response.jsonPath().getString("data"), "Response body does not contain expected data");
    }
}