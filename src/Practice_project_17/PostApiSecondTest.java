package Practice_project_17;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class PostApiSecondTest {
    @Test
    public void testPostRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        String requestBody = "{\"form\":{\"foo1\":\"bar1\", \"foo2\":\"bar2\"}}"; // данные формы

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .extract().response();

        Assertions.assertEquals(200, response.getStatusCode(), "Response status code is not 200");

        Assertions.assertEquals("bar1", response.jsonPath().getString("form.foo1"), "Response body does not contain expected form.foo1");
        Assertions.assertEquals("bar2", response.jsonPath().getString("form.foo2"), "Response body does not contain expected form.foo2");
    }
}
