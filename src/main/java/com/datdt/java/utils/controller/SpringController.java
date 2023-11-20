package com.datdt.java.utils.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spring")
public class SpringController {

    @Value("#{'${app.values:Testing,Data}'.split(',')}")
    List<String> values;

    @GetMapping("value")
    public ResponseEntity<List<String>> testValues() {
        return ResponseEntity.ok(values);
    }
}
