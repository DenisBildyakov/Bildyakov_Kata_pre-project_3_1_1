package com.denisbildyakov.pp_3_1_1_springboot.service;


import com.denisbildyakov.pp_3_1_1_springboot.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> findAllUsers();

    public void removeUserById(long id);

    public User findUserById(long id);

    public void updateUser(long id, User user);
}
