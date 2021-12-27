package com.example.spring_security.service;

import com.example.spring_security.domain.Role;
import com.example.spring_security.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}
