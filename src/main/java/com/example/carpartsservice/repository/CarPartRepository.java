package com.example.carpartsservice.repository;

import com.example.carpartsservice.entity.CarPart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarPartRepository extends JpaRepository<CarPart, Long> {
}
