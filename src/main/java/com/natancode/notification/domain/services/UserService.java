package com.natancode.notification.domain.services;

import com.natancode.notification.domain.exception.UserNotFoundException;
import com.natancode.notification.domain.model.User;
import com.natancode.notification.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(long id) {
        return userRepository.findById(id).orElseThrow( () -> new UserNotFoundException(id) );
    }

}
