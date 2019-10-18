package br.com.andre.sbserver.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/example")
public class ExampleRest {

    private final Logger log = LoggerFactory.getLogger(ExampleRest.class);

    @GetMapping
    public ResponseEntity<List<String>> getValues() {
        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<String> setValue(@RequestBody String value) {
        return ResponseEntity.ok("OK");
    }
}
