package co.com.perficient.p2.controllers;

import co.com.perficient.p2.model.dto.CarDto;
import co.com.perficient.p2.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<CarDto> create(@RequestBody CarDto carDto){
        return new ResponseEntity<>(carService.create(carDto),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CarDto>> findAll(){
        return ResponseEntity.ok(carService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarDto> findById(@PathVariable Long id){
        return ResponseEntity.ok(carService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CarDto> update(@RequestBody CarDto carDto, @PathVariable Long id){
        return ResponseEntity.ok(carService.update(carDto, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        carService.delete(id);
        return ResponseEntity.ok().build();
    }
}
