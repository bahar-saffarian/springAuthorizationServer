package com.bahar.springauthorizationserver.repository;

import com.bahar.springauthorizationserver.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByUsername(String userName);
}
