package ru.ndutko.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
