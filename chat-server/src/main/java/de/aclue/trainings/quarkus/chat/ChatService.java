package de.aclue.trainings.quarkus.chat;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class ChatService {


    public Uni<List<Chat>> getChat() {
        return Chat.listAll();
    }

    public Uni<Chat> addChat(Chat chat) {
        return chat.persist();
    }

}
