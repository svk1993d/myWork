package com.myapp.todoapp.repositories;
 
import org.springframework.data.mongodb.repository.MongoRepository;

import com.myapp.todoapp.models.Customer;
 
public interface CustomerMongoRepository extends MongoRepository<Customer, String> {
 
}