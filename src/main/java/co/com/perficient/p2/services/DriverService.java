package co.com.perficient.p2.services;

import co.com.perficient.p2.model.dto.DriverDto;

import java.time.LocalDate;
import java.util.List;

public interface DriverService extends CrudService<DriverDto, Short> {
    DriverDto findByName(String name);
    List<DriverDto> findBetweenDates(LocalDate dateFrom, LocalDate dateUntil);
}
