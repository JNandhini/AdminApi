package com.users.job.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.job.model.Job;
import com.users.job.services.JobService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.users.job.model.JobRole;

@RestController
@RequestMapping("/job")
public class JobController {
   final JobService jobService;
    public JobController(JobService jobService) {
        super();
this.jobService=jobService;
    }
@GetMapping("/jobselectall")
public List<JobRole> getAll()
{
    return this.jobService.getAll();
}
    @GetMapping("/jobid/{id}")
    public Job findById(@PathVariable int id)
    {
        return this.jobService.findById(id);
    }
    @PutMapping(value="jobupdate")
    public boolean updateJob( @RequestBody Job job) {
        
        return this.jobService.save(job);
    }
    @PostMapping(value="jobcreate")
    public boolean postMethodName(@RequestBody Job job) {
        
        return this.jobService.save(job);
    }
    @DeleteMapping("/jobdelete/{id}")
    public void deleteById(@PathVariable int id) {
         this.jobService.deleteById(id);
        
    }
}
