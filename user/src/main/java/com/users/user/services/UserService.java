package com.users.user.services;
import java.util.List;
import com.users.user.entity.User;
import com.users.user.entity.UserRole;

public interface UserService {
    List<UserRole> getAll();
    boolean userCreate(User user);
    void deleteById(int id);
    boolean updateUser(User user);
    User getById(int id);

}
