package com.autofinanzas.platform.security.controllers;

import com.autofinanzas.platform.security.entities.Role;
import com.autofinanzas.platform.security.entities.User;
import com.autofinanzas.platform.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "${ip.frontend}", allowCredentials = "true", exposedHeaders = "Authorization")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder bcrypt;

    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        String bcryptPassword = bcrypt.encode(user.getPassword());
        user.setPassword(bcryptPassword);
        userService.save(user);
    }

    @PostMapping("/rol")
    public void createRol(@RequestBody Role rol) {
        userService.grabar(rol);
    }

    @PostMapping("/save/{user_id}/{rol_id}")
    public ResponseEntity<Integer> saveUserRol(@PathVariable("user_id") Long user_id,
                                               @PathVariable("rol_id") Long rol_id) {
        return new ResponseEntity<>(userService.insertUserRol(user_id, rol_id), HttpStatus.OK);
    }
}