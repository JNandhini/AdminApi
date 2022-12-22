package com.location.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.location.model.Location;

public interface LocationRepository extends JpaRepository<Location,Integer>{
    @Query(value="Select * from job_location location where location.jobloca_id=:Id",nativeQuery = true)
    Location findById(int Id);
    List<Location> findAll();
    @Query(value ="Select * from job_location location where location.is_active='yes'",nativeQuery = true)
    List<Location> findByIsActive();
    @Modifying
    @Query(value = "delete  from job_location location where location.jobloca_id=:Id",nativeQuery = true)
    void deleteById(Integer Id);
}
