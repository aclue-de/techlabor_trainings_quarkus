package de.aclue.trainings.quarkus;

import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("/chat-client")
@Produces("application/json")
@Consumes("application/json")
public class ChatResource {
    private final ChatServerService chatService;

    public ChatResource(@RestClient ChatServerService chatService) {
        this.chatService = chatService;
    }

    @GET
    public List<Chat> getChat() {
        return chatService.getChat();
    }

    @POST
    public void sendChat(@Valid Chat chat) {
        chatService.sendChat(chat);
    }
}
