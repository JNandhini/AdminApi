package com.users.job.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.users.job.model.Job;

public interface JobRepository extends JpaRepository<Job,Integer> {
    Job findById(int id);
    @Modifying
    @Query(value = "DELETE FROM job_details WHERE job_id=:job_id",nativeQuery = true)
    void deleteById(int job_id);
}
