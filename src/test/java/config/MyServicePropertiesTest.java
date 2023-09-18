package config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyServicePropertiesTest {

    @Test
    void test(@Autowired MyServiceProperties myServiceProperties) {
        assertThat(myServiceProperties.isEnabled()).isFalse();
    }
}