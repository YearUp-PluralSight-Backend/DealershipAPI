package com.pluralsight.dealershipapi.service.impl;


import com.pluralsight.dealershipapi.dao.impl.SalesDaoImpl;
import org.springframework.stereotype.Service;

@Service
public class SalesServiceImpl {


    private final SalesDaoImpl salesDaoImpl;

    public SalesServiceImpl(SalesDaoImpl salesDaoImpl) {
        this.salesDaoImpl = salesDaoImpl;
    }
}
