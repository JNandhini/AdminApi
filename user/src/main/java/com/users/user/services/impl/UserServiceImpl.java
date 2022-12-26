package com.users.user.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.users.user.entity.User;
import com.users.user.entity.UserRole;
import com.users.user.repo.UserRepository;
import com.users.user.services.UserService;

import jakarta.persistence.EntityManager;

@Service
@Transactional
public class UserServiceImpl implements UserService {
     @Autowired
     EntityManager em;
     UserRepository repo;
    public UserServiceImpl(UserRepository repo) {
        super();
        this.repo=repo;
    }
    @Override
    public List<UserRole> getAll()
    {
        String sql=String.format("select p.*,c.role_name AS role_name from user_account p ,job_role c where p.role_id=c.role_id");
        List<UserRole> list =em.createNativeQuery(sql,UserRole.class).getResultList();
        return  list;
    }
    @Override
    public void deleteById(int user_id) {
           this.repo.deleteById(user_id);        
    }
    @Override
    public boolean updateUser(User user) {
       this.repo.save(user);
        return true;
    }
    @Override
    public boolean userCreate(User user) {
        this.repo.save(user);
        return true;
    }
    @Override
    public User getById(int id) {
        return this.repo.findById(id);
    }
    
}
