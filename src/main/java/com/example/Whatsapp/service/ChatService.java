package com.example.Whatsapp.service;

import org.springframework.stereotype.Service;
import com.example.Whatsapp.model.Message;
import com.example.Whatsapp.repository.ChatRepository; 
import com.example.Whatsapp.model.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Whatsapp.service.NotificationService;

@Service
public class ChatService {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private UserService userService; // Added UserService to check if user is logged in

    @Autowired
    private ChatRepository chatRepository;
    public void sendMessage(MessageDTO messageDTO) {
        
        Message message = new Message(); // Fixed variable name
        message.setSenderId(messageDTO.getSenderId()); // Fixed variable name
        message.setReceiverId(messageDTO.getReceiverId()); // Fixed variable name
        message.setContent(messageDTO.getContent()); // Fixed variable name
        message.setContentType(messageDTO.getContentType()); // Fixed variable name

        System.out.println("Message saved: " + message);
        System.out.println("Checking if user is connected: " + message.getReceiverId());
        
        chatRepository.save(message); // Fixed variable name
    
        if (userService.isConnected(message.getReceiverId()))
            notificationService.notifyuser(message.getReceiverId(), message.getContent());
    
    }

}
