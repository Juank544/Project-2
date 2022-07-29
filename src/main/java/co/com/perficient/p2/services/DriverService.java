package co.com.perficient.p2.services;

import co.com.perficient.p2.dto.DriverDto;
import co.com.perficient.p2.model.Driver;

import java.util.List;

public interface DriverService extends CrudService<Driver, DriverDto, Short> {
    Driver findByName(String name);
    List<Driver> findBetweenDates(String date1, String date2);
}
