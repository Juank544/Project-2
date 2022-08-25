package co.com.perficient.p2.services.impl;

import co.com.perficient.p2.model.dto.DriverDto;
import co.com.perficient.p2.model.mappers.DriverMapper;
import co.com.perficient.p2.repository.DriverRepository;
import co.com.perficient.p2.services.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * @author : Juank544
 * @date : 19/07/2022
 **/
@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

    @Autowired
    private final DriverMapper mapper;
    @Autowired
    private final DriverRepository driverRepository;

    @Override
    public DriverDto create(DriverDto driverDto) {
        return mapper.mapDriver(driverRepository.save(mapper.mapDriver(driverDto)));
    }

    @Override
    public List<DriverDto> findAll() {
        return driverRepository.findAll()
                .stream().map(mapper::mapDriver)
                .collect(Collectors.toList());
    }

    @Override
    public DriverDto findById(Short id) {
        return mapper.mapDriver(driverRepository.findById(id)
                .orElseThrow(NoSuchElementException::new));
    }

    @Override
    public DriverDto update(DriverDto newDriver, Short id) {
        DriverDto currentDriver = findById(id);
        currentDriver.setCar(newDriver.getCar());
        return mapper.mapDriver(driverRepository.save(mapper.mapDriver(currentDriver)));
    }

    @Override
    public void delete(Short id) {
        try {
            driverRepository.deleteById(id);
        } catch (NoSuchElementException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DriverDto findByName(String name) {
        DriverDto driver = mapper.mapDriver(driverRepository.findByName(name));
        if (driver == null){
            throw new NoSuchElementException();
        } return driver;
    }

    @Override
    public List<DriverDto> findBetweenDates(LocalDate dateFrom, LocalDate dateUntil) {
        List<DriverDto> drivers = driverRepository.findByBirthBetween(dateFrom, dateUntil)
                .stream().map(mapper::mapDriver)
                .collect(Collectors.toList());
        if (drivers.isEmpty()){
            throw new NoSuchElementException();
        } return drivers;
    }
}
