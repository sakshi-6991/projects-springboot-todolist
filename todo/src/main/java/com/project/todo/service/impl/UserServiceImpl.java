package com.project.todo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.todo.entity.mysql.User;
import com.project.todo.model.UserBean;
import com.project.todo.repository.UserRepository;
import com.project.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void registerUser(UserBean userBean){
        User user = saveUser(userBean);
        userRepository.save(user);
    }
    public User saveUser(UserBean userBean){
        User user = new User();
        ObjectMapper mapper = new ObjectMapper();
        user = mapper.convertValue(userBean,User.class);
        user.setEnabled(true);
        user.setEmailVerified(false);
        user.setMobileVerified(false);
        user.setCreateAt(new Date());
        user.setUpdateAt(new Date());
        return user;
    }
}
