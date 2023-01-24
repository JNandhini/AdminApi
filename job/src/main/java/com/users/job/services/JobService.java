package com.users.job.services;

import java.util.List;

import com.users.job.model.Job;
import com.users.job.model.JobRole;

public interface JobService {
    List<JobRole> getAll();
    Job findById(int id);
    boolean save(Job job);
    boolean updateJob(Job job);
    void deleteById(int id);

}
