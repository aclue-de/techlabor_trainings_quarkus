package de.aclue.trainings.quarkus.chat;

public class Chat {
    public String author;
    public String message;

    public Chat() {
    }

    public Chat(String author, String message) {
        this.author = author;
        this.message = message;
    }
}
