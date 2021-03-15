package com.shop.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class ApiApplicationTests {

    @Test
    void contextLoads() {
        assertThat("aa").isEqualTo("aa");
    }
}
