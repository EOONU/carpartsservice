package service;

import com.example.carpartsservice.entity.CarPart;
import com.example.carpartsservice.repository.CarPartRepository;
import com.example.carpartsservice.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPartServiceImpl implements CarPartService {

    private final CarPartRepository repository;

    public CarPartServiceImpl(CarPartRepository repository) {
        this.repository = repository;
    }

    @Override
    public CarPart create(CarPart carPart) {
        return repository.save(carPart);
    }

    @Override
    public CarPart getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car part not found"));
    }

    @Override
    public List<CarPart> getAll() {
        return repository.findAll();
    }

    @Override
    public CarPart update(Long id, CarPart carPart) {

        CarPart existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car part not found"));

        existing.setName(carPart.getName());
        existing.setManufacturer(carPart.getManufacturer());
        existing.setPrice(carPart.getPrice());
        existing.setQuantity(carPart.getQuantity());

        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}