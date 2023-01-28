import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

public class TestGetUser {

    @Test
    public void GetUser() {

    given().
    when().
    get("https://reqres.in/api/users/2").
    then().
    log().all()
            .statusCode(200);
}
}
