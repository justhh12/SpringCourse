package ru.ndutko.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyTnit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Do my destruction");
    }
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
