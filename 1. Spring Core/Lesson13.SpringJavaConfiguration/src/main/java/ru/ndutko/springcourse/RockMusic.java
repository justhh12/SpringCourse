package ru.ndutko.springcourse;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    public String getSong() {
        return "Wing cries Mary";
    }
}
