package com.sha.microserviceprovideruser.dao;

import com.sha.microserviceprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 〈用户dao 类〉
 *
 * @author mazhongrong@smeyun.com
 * @date 2018/5/31
 */
@Repository
public interface UserRespository extends JpaRepository<User, Long> {
}
