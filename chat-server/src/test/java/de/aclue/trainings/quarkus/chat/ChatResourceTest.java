package de.aclue.trainings.quarkus.chat;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
@TestHTTPEndpoint(ChatResource.class)
public class ChatResourceTest {

    @Test
    public void testGetAllChatEndpoint() {
        given()
                .when()
                .get()
                .then()
                .statusCode(200)
                .body(containsString("\"author\":\"system\",\"message\":\"Hello from System DB!\""));
    }

    @Test
    public void testPostChatEndpoint() {
        given()
                .body("{\"author\": \"carl\", \"message\":\"Hello World\"}")
                .header("Content-Type", "application/json")
                .when().post()
                .then()
                .statusCode(204);

        given()
                .when()
                .get()
                .then()
                .statusCode(200)
                .body(containsString("\"author\":\"system\",\"message\":\"Hello from System DB!\""),
                        containsString("\"author\":\"carl\",\"message\":\"Hello World\""));

    }
}
