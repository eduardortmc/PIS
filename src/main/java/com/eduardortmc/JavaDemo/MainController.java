package com.eduardortmc.JavaDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MainController {

    private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping()
    Main main(@RequestParam (defaultValue = "") String university, String asignature, String name, String period, String language, String dream) {
        return new Main(counter.incrementAndGet(), String.format(template, university = "UTPL"), String.format(template, asignature = "Procesos de Ingeniería de Software"), String.format(template, name = "Eduardo Riera Tapia"), String.format(template, period = "Abr/Ago 2021"), String.format(template, language = "Java"), String.format(template, dream = "Master en bases de datos"));
    }
}
