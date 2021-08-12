/*package baseEntities;

import org.testng.annotations.Test;

public class BaseApiTest {

    @Test
    public void getU() {

    }

    @Test
    public void getUserDetailsTest() {
        int userID = 1;
        String endpoint = "/index.php?/api/v2/get_user/%s";

        given()
                .when()
                .get(String.format(endpoint, userID))
                .then()
                .log().body()
                .body("name", is("Alex Tros"))
                .body("email", equalTo("atrostyanko+0606@gmail.com"))
                .statusCode(HttpStatus.SC_OK);
    }
}
*/