package co.com.perficient.p2.controllers;

import co.com.perficient.p2.model.Driver;
import co.com.perficient.p2.services.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        if (driverService.findById(id) != null) {
            return ResponseEntity.ok(driverService.findById(id));
        } return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Driver> update(@RequestBody Driver driver, @PathVariable Short id){
        return ResponseEntity.ok(driverService.update(driver,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Short id){
        driverService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
