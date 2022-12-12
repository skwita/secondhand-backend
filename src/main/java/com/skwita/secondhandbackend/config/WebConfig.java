package com.skwita.secondhandbackend.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.skwita.secondhandbackend.model.Category;
import com.skwita.secondhandbackend.model.Clothing;
import com.skwita.secondhandbackend.model.Season;
import com.skwita.secondhandbackend.model.State;
import com.skwita.secondhandbackend.service.ClothingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    private final ClothingService clothingService;

    @Autowired
    public WebConfig(ClothingService clothingService) {
        this.clothingService = clothingService;
    }

    @Bean
    public CommandLineRunner loadAdmin() {
        if (clothingService.getAllClothing().isEmpty()) {
            clothingService.addClothing(
                    new Clothing(Category.DRESS, 
                                 State.NEW,
                                 "Nike", 
                                 1000, 
                                 "Red", 
                                 Season.SUMMER, 
                                 "silk")
            );
            clothingService.addClothing(
                    new Clothing(Category.PANTS, 
                                 State.NEW,
                                 "Adidas", 
                                 2000, 
                                 "Blue", 
                                 Season.SUMMER, 
                                 "silk")
            );
        }
        return null;
    }
}
