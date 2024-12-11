package com.pluralsight.dealershipapi.dao;

import com.pluralsight.dealershipapi.models.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleDao {

    boolean add(Vehicle vehicle);
    boolean update(int id, Vehicle vehicle);
    boolean deleteById(int id);
    Optional<Vehicle> findById(int id);
    List<Vehicle> findAll();
}
