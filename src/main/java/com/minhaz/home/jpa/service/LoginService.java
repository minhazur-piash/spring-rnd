package com.minhaz.home.jpa.service;

import com.minhaz.home.jpa.entity.User;
import com.minhaz.home.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name) {
        User user = new User();
        user.setName(name);
        userRepository.save(user);
        return user;
    }

}
