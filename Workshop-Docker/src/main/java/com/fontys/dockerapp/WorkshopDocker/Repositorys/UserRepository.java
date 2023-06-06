package com.fontys.dockerapp.WorkshopDocker.Repositorys;

import com.fontys.dockerapp.WorkshopDocker.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}