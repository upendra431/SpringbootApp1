package com.example.demo.dtl;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
@Repository
public interface UserRepo extends MongoRepository<User, Integer>{

}
