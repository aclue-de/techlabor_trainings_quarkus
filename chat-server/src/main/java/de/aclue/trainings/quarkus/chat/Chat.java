package de.aclue.trainings.quarkus.chat;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Chat extends PanacheEntity {
    public String author;
    public String message;

    public Chat() {
    }

    public Chat(String author, String message) {
        this.author = author;
        this.message = message;
    }
}
