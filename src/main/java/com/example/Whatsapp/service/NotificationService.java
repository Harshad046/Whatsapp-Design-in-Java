package com.example.Whatsapp.service;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyuser(Long userId, String message) {
        // Logic to send notification to the user
        System.out.println("Notification sent to user " + userId + ": " + message);
    }

}
