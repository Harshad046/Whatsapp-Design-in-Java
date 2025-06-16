package com.example.Whatsapp.model;

import com.example.Whatsapp.enums.ContentType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import lombok.Data;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="messages")
@Data

public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageId;
    private Long senderId;
    private Long receiverId;
    private String content;
    private ContentType contentType;

    @CreatedDate
    private LocalDateTime createdon;
}
