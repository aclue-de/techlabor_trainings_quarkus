package de.aclue.trainings.quarkus;

import jakarta.validation.constraints.NotBlank;

public class Chat {
    @NotBlank
    public String author;
    @NotBlank
    public String message;

    public Chat() {
    }

    public Chat(String author, String message) {
        this.author = author;
        this.message = message;
    }
}
