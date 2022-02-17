package com.example.marketplace_backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Long> {
    List<Shoe> findShoesByBrandEquals(String brand);
    List<Shoe> findShoesBySizeEquals(int size);

}
