package tests.api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiSimpleTest {

    @Test
    public void test() {
        String endpoint = "/api/users?page=2";

        //Настройка Rest Assured
        //RestAssured.baseURI = "https://reqres.in/";

        //Настройка Request
        RequestSpecification httpRequest = given();

        //Настройка ответа
        Response response = httpRequest.request(Method.GET, "https://reqres.in/api/users?page=2");
        System.out.println(response);

        //Получить тело Response
        String responceBody = response.getBody().asString();
        System.out.println(responceBody);

        //
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void tes1(){
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body();

    }
}
