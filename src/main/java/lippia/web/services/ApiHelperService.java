package lippia.web.services;

import com.crowdar.core.PropertyManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

public class ApiHelperService {

    static String key = PropertyManager.getProperty("x-api-key");
    static String baseUrl = PropertyManager.getProperty("base.url");

    public static Response sendPostRequest(String url, String body) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .body(body)
                .post(url);
    }

    public static Response sendPutRequest(String url, String body) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .body(body)
                .put(url);
    }

    public static Response sendGetRequest(String url) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .get("/workspaces")
                .then()
                .extract()
                .response();
    }

    public static Response sendDeleteRequest(String url) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .delete(url);
    }

    public static Response sendDeleteRequestParam(String url, String param, List<String> params) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("x-api-key", key)
                .queryParams(param, params)
                .delete(url);
    }

    public static void createEntry(){
        String body = "{\"start\": \"2024-06-27T09:00:00Z\",\"end\": \"2024-06-27T17:00:00Z\",\"billable\": true,\"description\": \"PROYECTO\",\"projectId\": \"6660db4e114db803b8dd508b\"};";
        String endpoint = baseUrl + "/workspaces/6532bafc671f3c6ed91e3332/time-entries";
        sendPostRequest(endpoint, body);
    }

    public static void createWorkspace(){
        String body = "{\"name\": \"NewTP3Workspace\"}";
        String endpoint = baseUrl + "/workspaces";
        sendPostRequest(endpoint, body);
    }

}
