package com.fastcampus.springrunner.divelog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(args = {"--app.name=dive-log-test"})
public class ApplicationArgumentTest {
    @Test
    void testApplicationArgument(@Autowired ApplicationArguments appArguments) {
        assertThat(appArguments.getOptionNames()).containsOnly("app.name");
        assertThat(appArguments.getOptionValues("app.name")).containsOnly("dive-log-test");
    }
}
