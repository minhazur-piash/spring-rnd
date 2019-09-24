package com.minhaz.home.jpa.repository;

import com.minhaz.home.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
