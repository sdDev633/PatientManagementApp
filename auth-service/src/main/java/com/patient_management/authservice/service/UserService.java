package com.patient_management.authservice.service;

import com.patient_management.authservice.model.Users;
import com.patient_management.authservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Optional<Users> findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
