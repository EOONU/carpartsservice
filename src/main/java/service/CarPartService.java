package service;

import com.example.carpartsservice.entity.CarPart;
import java.util.List;

public interface CarPartService {

    CarPart create(CarPart carPart);

    CarPart getById(Long id);

    List<CarPart> getAll();

    CarPart update(Long id, CarPart carPart);

    void delete(Long id);
}