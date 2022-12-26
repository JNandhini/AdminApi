package com.users.user.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.users.user.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    @Query(value = "select p.user_id AS user_id, p.first_name AS first_name , p.last_name  AS last_name,p.email_id as email_id ,p.contact_number  as contact_number, p.is_active as is_active, DATE_FORMAT(p.registration_date,'%Y-%m-%e') as registration_date,p.is_admin as is_admin ,p.login_password as login_password, p.role_id as role_id  from user_account p where p.user_id=:id ",nativeQuery = true)
    User findById(int id);
    @Modifying
    @Query(value = " delete from user_account WHERE  user_id = :id ",nativeQuery = true)
    void deleteById(int id);
    
}
