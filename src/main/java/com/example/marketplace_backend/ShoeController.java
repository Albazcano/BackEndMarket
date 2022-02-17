package com.example.marketplace_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")

@CrossOrigin
public class ShoeController {

    private final ShoeRepository shoeRepository;

    @Autowired
    public ShoeController(ShoeRepository shoeRepository){

        this.shoeRepository = shoeRepository;

    }

    @GetMapping
    List<Shoe> listShoe(){

        List<Shoe> shoes = shoeRepository.findAll();
        return shoes;
    }

    @GetMapping("/help")
    public String helpCheck(){
        return "is ok";
    }

    @PostMapping("/")
    public Shoe createShoe(@RequestBody Shoe shoes){
        return shoeRepository.save(shoes);
    }


}
