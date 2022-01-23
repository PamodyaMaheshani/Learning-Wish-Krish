package com.training.rentcloud.authorization_server.repository;

import com.training.rentcloud.authorization_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String name);
}
