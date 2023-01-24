package com.users.job.services.impl;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.transaction.annotation.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.job.model.Job;
import com.users.job.model.JobRole;
import com.users.job.repo.JobRepository;
import com.users.job.services.JobService;

@Service
@Transactional
public class JobServiceImpl  implements JobService{
    @Autowired
    EntityManager em;
    JobRepository repo; 
    public JobServiceImpl(JobRepository repo) {
        super();
        this.repo=repo;
    }

    @Override
    public Job findById(int id) {
        return this.repo.findById(id);
         
    }

    @Override
    public boolean save(Job job) {
        this.repo.save(job);
        return true;
    }

    @Override
    public boolean updateJob(Job job) {
        this.repo.save(job);
        return true;
    }
    
    @Override
    public void deleteById(int job_id) {
       this.repo.deleteById(job_id);        
    }

    @Override
    public List<JobRole> getAll() {
        // Query query = em.createNativeQuery("SELECT * from job_details",JobRole.class);
        // List<JobRole> customerList = query.getResultList();
        // return customerList;
        String sql=String.format("select p.*, c.jobloca_name as jobloca_name from job_details p,job_location c where p.joblocation_id=c.jobloca_id");
        List<JobRole> list=this.em.createNativeQuery(sql, JobRole.class).getResultList();
        return list;
        // return this.repo.findAll();
    }

}
