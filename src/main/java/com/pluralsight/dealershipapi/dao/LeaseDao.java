package com.pluralsight.dealershipapi.dao;

import com.pluralsight.dealershipapi.models.Contract;

import java.util.List;
import java.util.Optional;

public interface LeaseDao {

    boolean add(Contract lease);
    boolean update(int id, Contract lease);
    boolean deleteById(int id);
    Optional<Contract> findById(int id);
    List<Contract> findAll();
}
