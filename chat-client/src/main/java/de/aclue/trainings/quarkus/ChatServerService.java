package de.aclue.trainings.quarkus;

import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/chat")
@RegisterRestClient(configKey = "chat-server")
public interface ChatServerService {

    @GET
    @Consumes("application/json")
    List<Chat> getChat();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    Chat sendChat(Chat chat);

}
