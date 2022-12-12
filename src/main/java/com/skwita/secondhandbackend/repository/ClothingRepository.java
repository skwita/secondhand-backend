package com.skwita.secondhandbackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.skwita.secondhandbackend.model.Clothing;

@Repository
public interface ClothingRepository extends CrudRepository<Clothing, Long>{
    List<Clothing> findAll();
}
