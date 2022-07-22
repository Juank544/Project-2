package co.com.perficient.p2.services;

import co.com.perficient.p2.dto.DriverDto;
import co.com.perficient.p2.model.Driver;

import java.util.List;

public interface DriverService {
    Driver create(Driver driver);
    List<Driver> findAll();
    Driver findById(Short id);
    Driver update(DriverDto driverDto, Short id);
    void delete(Short id);
}
