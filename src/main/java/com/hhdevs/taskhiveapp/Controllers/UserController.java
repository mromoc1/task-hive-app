package com.hhdevs.taskhiveapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hhdevs.taskhiveapp.Models.UserModel;
import com.hhdevs.taskhiveapp.Services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@RequestBody UserModel user){
        if(userService.createUser(user)){
            return new ResponseEntity<String>("El usuario fue creado satisfactoriamente.", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("El usuario ingresado no se encuentra disponible", HttpStatus.BAD_REQUEST);
        }
    }
}
