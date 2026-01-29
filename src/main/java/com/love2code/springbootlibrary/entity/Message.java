package com.love2code.springbootlibrary.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "messages")
@Getter
@Setter
public class Message {

    public Message(){}

    public Message(String title, String question) {
        this.title = title;
        this.question = question;
    }

    public Message(String title, String question, String userEmail) {
        this.title = title;
        this.question = question;
        this.userEmail = userEmail;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "title")
    private String title;

    @Column(name = "question")
    private String question;

    @Column(name = "admin_email")
    private String adminEmail;

    @Column(name = "response")
    private String response;

    @Column(name = "closed")
    private boolean closed;
}
