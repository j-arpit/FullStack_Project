package com.matricstream.fullstack.repository;

import java.util.List;

import com.matricstream.fullstack.entity.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByUsername(String username);
}
