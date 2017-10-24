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
package com.budiluhur.pemweb.web.controller;

import com.budiluhur.pemweb.model.User;
import com.budiluhur.pemweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Author andry on 24/10/17.
 */
@RestController
@RequestMapping("/api")
public class Index {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String getAllData(@RequestParam(value = "name") String name){

        String result = null;
        if(name!=null)
            result="hello "+name;
        else
            return "hello anonymous";
        return result;
    }

    @RequestMapping("/user/search")
    public List<User> getUserByName(@RequestParam(value = "name") String name){
        List<User> userList = new ArrayList<>();

        if(name!=null){
            userList = userService.getUserByName(name);
        }

        return userList;
    }

    @PostMapping(value = "/user/save")
    public Response saveUser(@RequestBody User user){
        userService.saveUser(user);
        Response response = new Response("OK",user);
        return response;
    }
}
