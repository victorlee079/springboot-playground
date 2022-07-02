package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.doamin.Log;

public interface LogRepository extends MongoRepository<Log, String> {
    
}
