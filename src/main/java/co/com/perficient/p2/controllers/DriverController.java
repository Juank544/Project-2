package co.com.perficient.p2.controllers;

import co.com.perficient.p2.dto.DriverDto;
import co.com.perficient.p2.model.Driver;
import co.com.perficient.p2.services.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author : Juank544
 * @date : 19/07/2022
 **/
@RestController
@RequestMapping("/drivers")
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping
    public ResponseEntity<Driver> create(@RequestBody Driver driver){
        return new ResponseEntity<>(driverService.create(driver),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Driver>> findAll(){
        return ResponseEntity.ok(driverService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Driver> findById(@PathVariable Short id){
        return ResponseEntity.ok(driverService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Driver> update(@RequestBody DriverDto driverDto, @PathVariable Short id){
        return ResponseEntity.ok(driverService.update(driverDto,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Short id){
        driverService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Driver> findByName(@PathVariable String name){
        return ResponseEntity.ok(driverService.findByName(name));
    }

    @GetMapping("/years/{yearFrom}/{yearUntil}")
    public ResponseEntity<List<Driver>> findByRangeYears(@PathVariable String yearFrom, @PathVariable String yearUntil){
        LocalDate dateFrom = LocalDate.of(Integer.parseInt(yearFrom),1,1);
        LocalDate dateUntil = LocalDate.of(Integer.parseInt(yearUntil),12,31);
        return ResponseEntity.ok(driverService.findBetweenDates(dateFrom, dateUntil));
    }
}
