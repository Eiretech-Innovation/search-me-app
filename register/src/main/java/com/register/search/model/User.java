package com.register.search.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document(collection = "users")
public class User {
    @id
    private String id;
    private String name;
    private String email;
    private String password;
    private String role;
    private String status;
}

