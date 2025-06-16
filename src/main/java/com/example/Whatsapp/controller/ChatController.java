package com.example.Whatsapp.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.Whatsapp.service.ChatService;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.Whatsapp.service.ChatService;
import com.example.Whatsapp.model.MessageDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/chats")
public class ChatController {
    
    @Autowired
    private ChatService chatService;

    @PostMapping("/send")
    public void sendMessage(@RequestBody MessageDTO messageDTO) {
        chatService.sendMessage(messageDTO);

    }

}

