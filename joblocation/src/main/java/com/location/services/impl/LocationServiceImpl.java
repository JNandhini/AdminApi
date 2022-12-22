package com.location.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.location.model.Location;
import com.location.repo.LocationRepository;
import com.location.services.LocationService;

@Service
@Transactional
public class LocationServiceImpl implements LocationService{
    @Autowired LocationRepository repo;
    @Override
    public List<Location> getAll()
    {
        return repo.findAll();
    }
    @Override
    public Location getById(int Id)
    {
        return repo.findById(Id);
    }
    @Override
    public List<Location> getByIsActive()
    {
         List<Location> location= repo.findByIsActive();
         return location;
    }
    @Override
    public boolean save(Location location)
    {
      repo.save(location);
      return true;
    }
    @Override
    public boolean update(Location location)
    {
        repo.save(location);
        return true;
    }
    @Override
    public void deleteById(Integer Id)
    {
        repo.deleteById(Id);
    }
}
