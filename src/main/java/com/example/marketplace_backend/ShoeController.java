package com.example.marketplace_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ShoeController {

    private ShoeRepository shoeRepository;

    @Autowired
    public ShoeController(ShoeRepository shoeRepository){

        this.shoeRepository = shoeRepository;

    }

    @GetMapping
    String listShoe(Model model, @RequestParam(required = false) String brand, int size, double price){

        List<Shoe> shoes;

        if (brand != null) {
            shoes = shoeRepository.findShoesByBrandEquals(brand);
            model.addAttribute("title", "Shoes from brand " + brand);
        } else if (size >= 36) {
            shoes = shoeRepository.findShoesBySizeEquals(size);
            model.addAttribute("title", "Shoes from size " + size);
        } else {
            shoes = shoeRepository.findAll();
            model.addAttribute("title", "Shoes catalog");
        }

        model.addAttribute("shoes", shoes);
        return "home";
    }
}
