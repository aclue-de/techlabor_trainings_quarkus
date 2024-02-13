package de.aclue.trainings.quarkus.chat;

import io.quarkus.hibernate.reactive.panache.common.WithTransaction;
import io.smallrye.mutiny.Uni;
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
    @WithTransaction
    public Uni<List<Chat>> getChat() {
        return chatService.getChat();
    }

    @POST
    @WithTransaction
    public Uni<Chat> sendChat(Chat chat) {
        return chatService.addChat(chat);

    }
}
