package com.knf.dev.demo.crudapplication.repository;

import com.knf.dev.demo.crudapplication.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}