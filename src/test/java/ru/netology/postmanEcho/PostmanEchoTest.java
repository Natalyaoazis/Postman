package ru.netology.postmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanEchoTest {
    @Test
    public void shouldPost() {
// Предусловия
    given()
            .baseUri("https://postman-echo.com")
            .body("My first test") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
            .when()
            .post("/post")
// Проверки
            .then()
            .statusCode(200)
            .body("data", equalTo("My first test"))
    ;
}
}
