package com.pluralsight.dealershipapi.service.impl;


import com.pluralsight.dealershipapi.dao.impl.LeaseDaoImpl;
import org.springframework.stereotype.Service;

@Service
public class LeaseServiceImpl {

    private final LeaseDaoImpl leaseDaoImpl;

    public LeaseServiceImpl(LeaseDaoImpl leaseDaoImpl) {
        this.leaseDaoImpl = leaseDaoImpl;
    }


}
