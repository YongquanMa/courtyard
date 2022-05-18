package com.example.courtyard.service;

import com.example.courtyard.entity.User;
import com.example.courtyard.entity.UserRole;
import com.example.courtyard.exception.UserAlreadyExistException;
import com.example.courtyard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RegisterService {
    private UserRepository userRepository;

    @Autowired
    public RegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void add(User user, UserRole userRole) throws UserAlreadyExistException {
        user.setUserRole(userRole);
        if (userRepository.existsById(user.getUsername())) {
            throw new UserAlreadyExistException("User already exists!");
        }
        userRepository.save(user);
    }
}
