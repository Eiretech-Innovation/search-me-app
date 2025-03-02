package com.register.search.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

}

