package com.datdt.java.utils.controller;

import com.datdt.java.utils.service.impl.TestRetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/retry")
public class TestRetryController {

    @Autowired
    TestRetryService testRetryService;

    @GetMapping("/test")
    public ResponseEntity<Object> testValues() {
        return ResponseEntity.ok(testRetryService.methodWillRetry());
    }
}
