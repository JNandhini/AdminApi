package com.users.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
// @Table(name="user_account")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int user_id;
    public String first_name;
    public String last_name;
    public String contact_number;
    public String email_id;
    public String is_active;
    public String is_admin;
    public String login_password;
    public Integer role_id;
    public String  registration_date;
    public String role_name;
   
}
