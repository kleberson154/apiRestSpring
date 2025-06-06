package com.kleberson.apiRestJava.service;

import com.kleberson.apiRestJava.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}