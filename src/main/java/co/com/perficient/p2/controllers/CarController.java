package co.com.perficient.p2.controllers;

import co.com.perficient.p2.model.dto.CarDto;
import co.com.perficient.p2.model.entities.Car;
import co.com.perficient.p2.services.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Juank544
 * @date : 21/07/2022
 **/
@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<Car> create(@RequestBody Car car){
        return new ResponseEntity<>(carService.create(car),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Car>> findAll(){
        return ResponseEntity.ok(carService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> findById(@PathVariable Long id){
        return ResponseEntity.ok(carService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Car> update(@RequestBody CarDto carDto, @PathVariable Long id){
        return ResponseEntity.ok(carService.update(carDto, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        carService.delete(id);
        return ResponseEntity.ok().build();
    }
}
