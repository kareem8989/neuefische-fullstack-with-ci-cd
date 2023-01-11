package de.neuefische.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarRepo repo;

    @PostMapping
    public Car createCar(@RequestBody Car car){
        return repo.save(car);

    }
}
