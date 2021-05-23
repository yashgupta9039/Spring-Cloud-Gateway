package com.location.microservice.service;

import com.location.microservice.entity.Location;

import java.util.List;

public interface LocationService {
    List<Location> retrieveLocations();
}
