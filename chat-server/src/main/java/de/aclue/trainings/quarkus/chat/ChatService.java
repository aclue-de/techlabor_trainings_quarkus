package de.aclue.trainings.quarkus.chat;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ChatService {

    List<Chat> chatList = new ArrayList<>();

    @PostConstruct
    void init() {
        chatList.add(new Chat("system", "Hello from System"));
    }

    public List<Chat> getChat() {
        return chatList;
    }

    public void addChat(Chat chat) {
        chatList.add(chat);
    }

}
