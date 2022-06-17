package com.helltester.springseleniumtests.api;

import com.helltester.springseleniumtests.api.clients.UsersClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class ApiTest {

    @Autowired UsersClient usersClient;

    @Test
    void apiTest() {
        usersClient.getUsersList()
                .statusCode(200)
                .body("$.size()", equalTo(20));
    }
}
