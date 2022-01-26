package com.training.rentcloud.authorization_server.repository;

import com.training.rentcloud.authorization_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String name);
}
