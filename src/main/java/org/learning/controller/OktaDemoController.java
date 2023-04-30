package org.learning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/okta")
public class OktaDemoController {
    @GetMapping("/secured")
    public ResponseEntity<String> getStringByPassingOKtaToken() {
        return ResponseEntity.ok("Okta Access token is validated successfully. Go Ahead ...");
    }
}
