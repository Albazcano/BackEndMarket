package com.example.marketplace_backend;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="shoes")
public class Shoe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private int size;
    private double price;


    public Shoe(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }


    public Shoe() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    @Override
    public String toString() {
        return "Shoe{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
