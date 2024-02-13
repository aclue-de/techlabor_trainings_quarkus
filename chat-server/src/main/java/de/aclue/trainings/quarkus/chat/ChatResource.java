package de.aclue.trainings.quarkus.chat;

import jakarta.ws.rs.*;

import java.util.List;

@Path("/chat")
@Produces("application/json")
@Consumes("application/json")
public class ChatResource {

    private final ChatService chatService;

//    simplified constructor injection
    ChatResource(ChatService chatService) {
        this.chatService = chatService;
    }

    @GET
    public List<Chat> getChat() {
        return chatService.getChat();
    }

    @POST
    public void sendChat(Chat chat) {
        chatService.addChat(chat);
    }
}
