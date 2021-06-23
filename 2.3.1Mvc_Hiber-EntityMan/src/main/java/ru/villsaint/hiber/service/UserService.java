package ru.villsaint.hiber.service;

import ru.villsaint.hiber.models.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();
    User findById(int id);
    void save(User user);
    void update(User user);
    void delete(User user);
}
