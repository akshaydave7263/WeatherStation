package com.dave.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dave.model.Message;
import com.dave.service.MessageService;

@Path("messages")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class MessageResource {

	
	MessageService m1 =new MessageService();
    
   @GET
    public List<Message>getMessages() {
        return m1.getAllMessages();
    }
    
   @POST
   public Message addMessage(Message message)
   {
	return m1.addMessage(message) ;
	   
   }
   
   @PUT
   @Path("/{messageId}")
   public Message updateMessage(@PathParam("messageId") long id,Message message)
   { 
	   message.setId(id);
	   return m1.updateMessage(message);
   }
   
   @DELETE
   @Path("/{messageId}")
   public void deleteMessage(@PathParam("messageId") long id)
   {
	   m1.removeMessage(id);
	
	   
   }
   
   
   @GET
   @Path("/{messageId}")
   public Message getMessage(@PathParam("messageId") long id)
   {
	return m1.getMessage(id);   
   }
    
   
}