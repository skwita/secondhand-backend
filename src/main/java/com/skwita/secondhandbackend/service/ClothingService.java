package com.skwita.secondhandbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skwita.secondhandbackend.model.Clothing;
import com.skwita.secondhandbackend.repository.ClothingRepository;

@Service
public class ClothingService {
    private final ClothingRepository clothingRepository;

    @Autowired
    public ClothingService(ClothingRepository clothingRepository){
        this.clothingRepository = clothingRepository;
    }

    public List<Clothing> getAllClothing() {
        return clothingRepository.findAll();
    }

    public void addClothing(Clothing clothing) {
        clothingRepository.save(clothing);
    }
}