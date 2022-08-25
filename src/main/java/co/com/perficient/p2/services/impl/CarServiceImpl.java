package co.com.perficient.p2.services.impl;

import co.com.perficient.p2.model.dto.CarDto;
import co.com.perficient.p2.model.mappers.CarMapper;
import co.com.perficient.p2.repository.CarRepository;
import co.com.perficient.p2.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * @author : Juank544
 * @date : 19/07/2022
 **/
@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    @Autowired
    private final CarMapper mapper;
    @Autowired
    private final CarRepository carRepository;

    @Override
    public CarDto create(CarDto carDto) {
        return mapper.mapCar(carRepository.save(mapper.mapCar(carDto)));
    }

    @Override
    public List<CarDto> findAll() {
        return carRepository.findAll()
                .stream().map(mapper::mapCar)
                .collect(Collectors.toList());
    }

    @Override
    public CarDto findById(Long id) {
        return mapper.mapCar(carRepository.findById(id)
                .orElseThrow(NoSuchElementException::new));
    }

    @Override
    public CarDto update(CarDto newCar, Long id) {
        //TODO(EntityNotFoundException)
        CarDto currentCar = findById(id);
        currentCar.setTeam(newCar.getTeam());
        currentCar.setDrivers(newCar.getDrivers());
        return mapper.mapCar(carRepository.save(mapper.mapCar(currentCar)));
    }

    @Override
    public void delete(Long id) {
        try {
            carRepository.deleteById(id);
        } catch (NoSuchElementException e) {
            throw new RuntimeException(e);
        }
    }
}
