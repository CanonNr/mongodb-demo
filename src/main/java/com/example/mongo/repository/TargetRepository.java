package com.example.mongo.repository;

import com.example.mongo.entity.Target;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface  TargetRepository extends MongoRepository<Target, String> {


    List<Target> findByType(Integer type);

    @Query("{'info.name': ?0 }")
    List<Target> findByInfoName(String name);
}
