package com.datdt.java.utils.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class TestRetryServiceImpl implements TestRetryService {
    private static int count = 0;
    @Override
    @Retryable(value = {RuntimeException.class}, maxAttempts = 100)
    public String methodWillRetry() {
        count++ ;
        if (count < 10) {
            log.info("count =" + count);
            throw new RuntimeException("retry");
        }
        log.info("completed, count=" + count);
        return "OK";
    }
}
