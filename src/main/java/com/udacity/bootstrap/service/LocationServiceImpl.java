package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Location;
import com.udacity.bootstrap.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by janaksoni on 5/14/21.
 */

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    LocationRepository locationRepository;

    @Override
    public List<Location> retrieveLocations() {
        return (List<Location>) locationRepository.findAll();
    }
}
