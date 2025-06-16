package com.example.Whatsapp.model;

import com.example.Whatsapp.enums.ContentType;

import io.micrometer.common.lang.NonNull;
import lombok.Data;

@Data
public class MessageDTO {

    @NonNull
    private Long senderId;
    
    @NonNull
    private Long receiverId;   
    
    @NonNull
    private String content;

    private ContentType contentType;
}
