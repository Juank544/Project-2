package co.com.perficient.p2.services;

import co.com.perficient.p2.dto.CarDto;
import co.com.perficient.p2.model.Car;

import java.util.List;

public interface CarService {
    Car create(Car car);
    List<Car> findAll();
    Car findById(Long id);
    Car update(CarDto carDto, Long id);
    void delete(Long id);
}
