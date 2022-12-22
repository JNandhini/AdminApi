package com.location.services;

import java.util.List;

import com.location.model.Location;

public interface LocationService {
    Location getById(int Id);
    List<Location> getAll();
    List<Location> getByIsActive();
    boolean save(Location location);
    boolean update(Location location);
    void deleteById(Integer Id);
}
