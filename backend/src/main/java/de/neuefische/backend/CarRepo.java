package de.neuefische.backend;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepo extends MongoRepository<Car,String> {
}
