package io.acmefintech;

import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App {
    public static void main(String[] args) { SpringApplication.run(App.class, args); }

    @GetMapping("/transfers")
    public Map<String, String> route0() { return Map.of("status", "ok"); }

    @PostMapping("/transfers")
    public Map<String, String> route1() { return Map.of("status", "ok"); }

    @GetMapping("/transfers/{id}")
    public Map<String, String> route2() { return Map.of("status", "ok"); }
}
