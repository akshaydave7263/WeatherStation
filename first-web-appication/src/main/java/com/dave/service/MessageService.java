package com.dave.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dave.database.DatabaseClass;
import com.dave.model.Message;

public class MessageService {
	
	public MessageService()
	{
		messages.put(1L, new Message(1,"Hello world","dave"));
		messages.put(2L, new Message(2,"Hello jersey","akshay"));
	}

	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public List<Message> getAllMessages()
	{
	   return new ArrayList <Message>(messages.values());
		
	}
	
	
	public Message getMessage(long id)
	{
		return messages.get(id);
		
	}
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
	    messages.put(message.getId(), message);
	    return message;
	   	
	}
	public Message updateMessage(Message message)
	{
		if(message.getId()<=0)
		{
			return null;
		}
		messages.put(message.getId(),message);
		
		return message;
		
	}
	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}
}

