package io.hack.poll.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.hack.poll.app.model.User;

@Repository
public interface UserDao extends JpaRepository<User,Integer>{

}
