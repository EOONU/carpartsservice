package controller;

import com.example.carpartsservice.entity.CarPart;
import com.example.carpartsservice.service.CarPartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carparts")
public class CarPartController {

    private final CarPartService service;

    public CarPartController(CarPartService service) {
        this.service = service;
    }

    @PostMapping
    public CarPart create(@RequestBody CarPart carPart) {
        return service.create(carPart);
    }

    @GetMapping("/{id}")
    public CarPart getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<CarPart> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public CarPart update(@PathVariable Long id, @RequestBody CarPart carPart) {
        return service.update(id, carPart);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
