package com.example.Whatsapp.service;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Whatsapp.model.User;
import com.example.Whatsapp.repository.UserRepository;

@Service
public class UserService {
    
    private final Set<Long> connectedUsers = ConcurrentHashMap.newKeySet();

    @Autowired
    private UserRepository userRepository;

    public User registerUser(String name, String phone) {
        User user = new User(); // Fixed typo
        user.setName(name);
        user.setPhone(phone); // Added missing semicolon

        return userRepository.save(user);
    }
 
    public User getUser(Long userId) { // Fixed method name
        Optional<User> user = userRepository.findById(userId); // Fixed method name

        if (user.isPresent()) {
            return user.get();
        }

        throw new RuntimeException("User not found");

    }

    public void login(Long userId) {
        connectedUsers.add(userId);
        System.err.println("User logged in: " + userId);
    }

    public void logout(Long userId) {
        connectedUsers.remove(userId);
        System.err.println("User logged out: " + userId);
    }

    public boolean isConnected(Long userId) {
        
        return connectedUsers.contains(userId);
    }
}

