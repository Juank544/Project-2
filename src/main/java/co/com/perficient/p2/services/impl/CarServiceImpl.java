package co.com.perficient.p2.services.impl;

import co.com.perficient.p2.model.Car;
import co.com.perficient.p2.repository.CarRepository;
import co.com.perficient.p2.services.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Juank544
 * @date : 19/07/2022
 **/
@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car create(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findById(Long id) {
        return carRepository.findById(id).isPresent() ? carRepository.findById(id).get() : null;
    }

    @Override
    public Car update(Car newCar, Long id) {
        Car currentCar = findById(id);
        currentCar.setName(newCar.getName());
        currentCar.setPowerUnit(newCar.getPowerUnit());
        return carRepository.save(currentCar);
    }

    @Override
    public void delete(Long id) {
        carRepository.deleteById(id);
    }
}
