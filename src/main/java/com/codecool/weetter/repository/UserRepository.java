package com.codecool.weetter.repository;

import com.codecool.weetter.modell.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
extends JpaRepository<User, Long>{

}
