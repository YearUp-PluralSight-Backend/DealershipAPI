package com.pluralsight.dealershipapi.service.impl;

import com.pluralsight.dealershipapi.dao.impl.DealerDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealerServiceImpl {


    private final DealerDaoImpl dealerDaoImpl;

    public DealerServiceImpl(DealerDaoImpl dealerDaoImpl) {
        this.dealerDaoImpl = dealerDaoImpl;
    }



}
