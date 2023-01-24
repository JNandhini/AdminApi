package com.users.job.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_details")
public class Job {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int job_id;
    public int jobrole_id;
    public int joblocation_id;
    public int noofopening;
    public String is_active;
    public String joblast_date;
    public String job_description;


    
}
