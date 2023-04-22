package com.hhdevs.taskhiveapp.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hhdevs.taskhiveapp.Models.UserModel;
import com.hhdevs.taskhiveapp.Repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean createUser(UserModel user){
        Optional<UserModel> existingUser = userRepository.findByUsername(user.getUsername());
        if(existingUser.isPresent()){
            return false;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setTaskLists(null); // Se setea a null para que no se almacene la lista de tareas
        userRepository.save(user);
        return true;
    }
}
