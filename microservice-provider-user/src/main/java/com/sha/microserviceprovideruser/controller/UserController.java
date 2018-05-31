package com.sha.microserviceprovideruser.controller;

import com.sha.microserviceprovideruser.dao.UserRespository;
import com.sha.microserviceprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈用户控制类〉
 *
 * @author mazhongrong@smeyun.com
 * @date 2018/5/31
 */
@RestController
public class UserController {
    @Autowired
    private UserRespository userRespository;
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRespository.getOne(id);
        return findOne;
    }
}
