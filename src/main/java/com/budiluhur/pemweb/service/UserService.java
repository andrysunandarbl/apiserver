/**
 * Innovez-One, Proprietary Software Cloud Communications
 * Copyright (c) 2015, Innovez-One and individual contributors
 * by the @authors tag.
 * <p>
 * This program is Proprietary Software: you can not redistribute it and/or modify
 * without license from Innovez-One.
 * <p>
 * Website : http://www.innovez-one.com/
 * Report bugs to <techsupport@innovez-one.com>.
 * Copyright (C) 2015 PT. Innovez-One. All rights reserved.
 */
package com.budiluhur.pemweb.service;

import com.budiluhur.pemweb.dao.UserRepository;
import com.budiluhur.pemweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Author andry on 24/10/17.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getUserByName(String name){

        return userRepository.findByNameContainingOrderByName(name);

    }
    
    public void saveUser(User user){
        
        userRepository.save(user);
        
    }
}
