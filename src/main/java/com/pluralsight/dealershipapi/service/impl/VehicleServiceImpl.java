package com.pluralsight.dealershipapi.service.impl;
import com.pluralsight.dealershipapi.dao.impl.VehicleDaoImpl;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl {

    private final VehicleDaoImpl vehicleDaoImpl;

    public VehicleServiceImpl(VehicleDaoImpl vehicleDaoImpl) {
        this.vehicleDaoImpl = vehicleDaoImpl;
    }
}
