package com.monitoring.prometheus.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    Counter visitCounter;

    public GreetingController(MeterRegistry registry) {
        visitCounter = Counter.builder("visit_counter")
                .description("Number of visits to the site")
                .register(registry);
    }

    @GetMapping("/greeting")
    public String greeting() {
        visitCounter.increment();
        return "Hello world";
    }
}
