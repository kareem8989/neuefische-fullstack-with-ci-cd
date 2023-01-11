package de.neuefische.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarRepo repo;

    @GetMapping
    public String getStatus(@RequestBody Car car){

        repo.save(car);

        return "ok";
    }
}
