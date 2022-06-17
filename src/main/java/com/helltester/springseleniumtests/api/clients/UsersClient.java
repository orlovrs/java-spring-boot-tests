package com.helltester.springseleniumtests.api.clients;

import com.helltester.springseleniumtests.api.requests.GetUserListRequest;
import com.helltester.springseleniumtests.config.ApiConfig;
import io.restassured.response.ValidatableResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.given;

@Component
public class UsersClient {

    @Autowired ApiConfig apiConfig;

    @Autowired GetUserListRequest getUserListRequest;

    public ValidatableResponse getUsersList() {
        return getUserListRequest.execute(
                given().baseUri(apiConfig.getBaseUrl())
                        .header("Content-Type", "application/json")
                        .header("Authorization", String.format("Bearer %s", apiConfig.getToken()))
        );
    }
}
