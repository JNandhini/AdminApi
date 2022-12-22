package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.model.Location;
import com.location.services.LocationService;
@RestController
@RequestMapping("")
public class LocationController {
    @Autowired LocationService locationService;
    @GetMapping("/locationbyid/{id}")
    public Location getById(@PathVariable  int id)
    {
        return locationService.getById(id);
    }
    @GetMapping("/locationall")
    public List<Location> getAll()
    {
        return locationService.getAll();
    }
    @GetMapping("/locationselectactive")
    public List<Location> getByIsActive()
    {
        return locationService.getByIsActive();
    }
    @PostMapping("/locationcreate")
    public boolean createLocation(@RequestBody Location location)
    {
        return locationService.save(location);
    }
    @PutMapping("/locationupdate")
    public boolean updateLocation(@RequestBody Location location)
    {
        return locationService.save(location);
    }
    @DeleteMapping("/locationdelete/{Id}")
    public void deleteLocation(@PathVariable int Id)
    {
        System.out.println(Id);
         locationService.deleteById(Id);
    }
}
