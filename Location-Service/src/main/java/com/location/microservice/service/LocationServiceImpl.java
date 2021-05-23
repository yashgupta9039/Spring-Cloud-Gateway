package com.location.microservice.service;

import com.location.microservice.entity.Location;
import com.location.microservice.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepository;

    public List<Location> retrieveLocations() {
        return (List<Location>) locationRepository.findAll();
    }
}
