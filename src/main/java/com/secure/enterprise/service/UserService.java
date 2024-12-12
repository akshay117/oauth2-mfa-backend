package com.secure.enterprise.service;


import com.secure.enterprise.dto.UserDTO;
import com.secure.enterprise.model.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}