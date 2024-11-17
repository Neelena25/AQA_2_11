package Practice_project_17;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class DeleteApiTest {
    @Test
    public void testDeleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .delete("/delete")
                .then()
                .extract().response();

        Assertions.assertTrue(
                response.getStatusCode() == 200 || response.getStatusCode() == 204,
                "Response status code is not 200 or 204"
        );

        if (response.getStatusCode() == 204) {
            Assertions.assertEquals("", response.getBody().asString(), "Response body is not empty for status 204");
        } else {

            Assertions.assertTrue(response.getBody().asString().isEmpty(), "Response body should be empty");
        }
    }
}
