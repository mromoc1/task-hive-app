package com.hhdevs.taskhiveapp.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhdevs.taskhiveapp.Models.UserModel;
import com.hhdevs.taskhiveapp.Repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public boolean createUser(UserModel user){
        Optional<UserModel> existingUser = userRepository.findByUsername(user.getUsername());
        if(existingUser.isPresent()){
            return false;
        }
        userRepository.save(user);
        return true;
    }
}
