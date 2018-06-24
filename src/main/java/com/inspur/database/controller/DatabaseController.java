package com.inspur.database.controller;

import com.inspur.database.entity.User;
import com.inspur.database.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    @Autowired
    DatabaseService databaseService;

    @GetMapping("/consumer/{id}")
    public User findById(@PathVariable("id")Long id){
        return databaseService.hiService(id);
    }


}
