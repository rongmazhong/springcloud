package com.sha.microserviceconsumermovie.controller;

import com.sha.microserviceconsumermovie.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 〈电影微服务〉
 *
 * @author mazhongrong@smeyun.com
 * @date 2018/5/31
 */
@RestController
public class MovieController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById (@PathVariable Long id){
        return this.restTemplate.getForObject("http://localhost:8000/" + id, User.class);
    }
}
