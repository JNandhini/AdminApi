package com.location.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.location.model.Location;
public interface LocationRepository extends JpaRepository<Location,Integer>{
    @Query(value="Select * from job_location location where location.jobloca_id=:Id",nativeQuery = true)
    Location findById(int Id);
    // @Query(value="Select location.jobloca_id AS Id, location.jobloca_name AS location, location.is_active AS Active, location.street AS Street, location.city AS city, location.state AS State, CONCAT(location.street , location.city, location.State, country) AS country, location.zip AS Zip from job_location location",nativeQuery=true)

    // @Query(value="Select *  location where  concat(location.city, location.street,location.state)  as city",nativeQuery=true)
    // @Query(value="Select jobloca_id AS Id, jobloca_name AS location, is_active AS Active, street AS Street, city AS city, state AS State, country AS country, zip AS Zip from job_location  ",nativeQuery=true)
    
    // List<Location> findAll();
    @Query(value = "Select *  from job_location location where location.is_active='yes'",nativeQuery = true)

    // @Query(value ="Select location.jobloca_id AS Id, location.jobloca_name AS location, location.is_active AS Active, location.street AS Street, location.city AS city, location.state AS State, location.country AS country, location.zip AS Zip  from job_location location where location.is_active='yes'",nativeQuery = true)
    List<Location> findByIsActive();
    @Modifying
    @Query(value = "delete  from job_location location where location.jobloca_id=:Id",nativeQuery = true)
    void deleteById(Integer Id);
}
