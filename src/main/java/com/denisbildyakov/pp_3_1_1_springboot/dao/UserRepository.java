package com.denisbildyakov.pp_3_1_1_springboot.dao;


import com.denisbildyakov.pp_3_1_1_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    public void deleteById(long id);

    public User findUserById(long id);
}
