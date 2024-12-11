package com.pluralsight.dealershipapi.dao;

import com.pluralsight.dealershipapi.models.Contract;

import java.util.List;
import java.util.Optional;

public interface SalesDao {

    boolean add(Contract sale);
    boolean update(int id, Contract sale);
    boolean deleteById(int id);
    Optional<Contract> findById(int id);
    List<Contract> findAll();
}
