package de.aclue.trainings.quarkus.chat;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class ChatService {


    public List<Chat> getChat() {
        return Chat.listAll();
    }

    @Transactional
    public void addChat(Chat chat) {
        Chat.persist(chat);
    }

}
