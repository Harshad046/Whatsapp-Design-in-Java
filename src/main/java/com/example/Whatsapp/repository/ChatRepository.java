package com.example.Whatsapp.repository;

import com.example.Whatsapp.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Message, Long> {
    // Custom query methods can be defined here if needed

}
