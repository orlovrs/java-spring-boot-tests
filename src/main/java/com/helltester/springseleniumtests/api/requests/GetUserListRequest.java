package com.helltester.springseleniumtests.api.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.springframework.stereotype.Component;

@Component
public class GetUserListRequest {

    private String method = "GET";
    private String url = "/users";

    public ValidatableResponse execute(RequestSpecification defaultSpec) {
        return defaultSpec
                .when().request(method, url)
                .then().log().all();
    }
}
