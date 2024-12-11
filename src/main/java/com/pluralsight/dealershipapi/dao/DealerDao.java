package com.pluralsight.dealershipapi.dao;

import com.pluralsight.dealershipapi.models.Dealer;

import java.util.List;
import java.util.Optional;

public interface DealerDao {

    boolean add(Dealer dealer);
    boolean update(int id, Dealer dealer);
    boolean deleteById(int id);
    Optional<Dealer> findById(int id);
    List<Dealer> findAll();
}
