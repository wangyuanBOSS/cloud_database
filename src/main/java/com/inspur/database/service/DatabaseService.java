package com.inspur.database.service;

import com.inspur.database.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DatabaseService {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public User hiService(Long id) {
        return restTemplate.getForObject("http://SERVICE-HI/dept/"+id,User.class);
    }

}
