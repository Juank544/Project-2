package co.com.perficient.p2.services.impl;

import co.com.perficient.p2.dto.DriverDto;
import co.com.perficient.p2.model.Driver;
import co.com.perficient.p2.repository.DriverRepository;
import co.com.perficient.p2.services.DriverService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @author : Juank544
 * @date : 19/07/2022
 **/
@Service
public class DriverServiceImpl implements DriverService {

    private final DriverRepository driverRepository;

    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public Driver create(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public List<Driver> findAll() {
        return driverRepository.findAll();
    }

    @Override
    public Driver findById(Short id) {
        return driverRepository.findById(id).isPresent() ? driverRepository.findById(id).get() : null;
    }

    @Override
    public Driver update(DriverDto newDriver, Short id) {
        Driver currentDriver = findById(id);
        currentDriver.setCar(newDriver.getCar());
        return driverRepository.save(currentDriver);
    }

    @Override
    public void delete(Short id) {
        driverRepository.deleteById(id);
    }

    @Override
    public Driver findByName(String name) {
        return driverRepository.findDriverByNameContains(name);
    }

    @Override
    public List<Driver> findBetweenDates(LocalDate dateFrom, LocalDate dateUntil) {
        return driverRepository.findByBirthBetween(dateFrom, dateUntil);
    }
}
