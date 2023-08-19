package com.eqipped.orderservice.repository;

import com.eqipped.orderservice.entities.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends MongoRepository<Cart, String> {


}
