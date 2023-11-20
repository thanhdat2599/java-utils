package com.datdt.java.utils.utils;

import com.datdt.java.utils.controller.SpringController;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.util.ReflectionUtils;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class ResourceUtilTest {

    @Test
    public void getResourceFileAsString() throws IOException {
        String jsonString = ResourceUtil.getResourceFileAsString("json/file.json");
        Assertions.assertFalse(StringUtils.isEmpty(jsonString));
    }

    @Test
    public void testReflection() {
        SpringController springController = new SpringController();
        List<String> expected = List.of("1","2");
        ReflectionTestUtils.setField(springController, "values", expected);
        List<String>  result = springController.testValues().getBody();
        Assertions.assertEquals(expected, result);
    }
}