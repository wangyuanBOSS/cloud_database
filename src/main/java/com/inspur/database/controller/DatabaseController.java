package com.inspur.database.controller;

import com.inspur.database.entity.User;
import com.inspur.database.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicea")
public class DatabaseController {

    @Autowired
    DatabaseService databaseService;

    @GetMapping("/house/{username}")
    public User findById(@PathVariable("username")String username){
        return databaseService.hiService(username);
    }


}
