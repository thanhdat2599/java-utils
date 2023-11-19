package com.datdt.java.utils.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class ResourceUtilTest {

    @Test
    public void getResourceFileAsString() throws IOException {
        String jsonString = ResourceUtil.getResourceFileAsString("json/file.json");
        Assertions.assertFalse(StringUtils.isEmpty(jsonString));
    }
}