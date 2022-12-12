package com.skwita.secondhandbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.skwita.secondhandbackend.model.Clothing;
import com.skwita.secondhandbackend.service.ClothingService;

@RestController
@RequestMapping("/api")
public class MainController {
    private final ClothingService clothingService;

    public MainController(ClothingService clothingService) {
        this.clothingService = clothingService;
    }

    @GetMapping("/all")
    public List<Clothing> getAllClothing() {
        return clothingService.getAllClothing();
    } 
}
