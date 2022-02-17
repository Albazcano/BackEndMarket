package com.example.marketplace_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private ShoeRepository shoeRepository;

    @Autowired
    public SampleDataLoader(ShoeRepository shoeRepository){ this.shoeRepository = shoeRepository;}

    @PostConstruct
    public void loadSampleData(){
        shoeRepository.saveAll(List.of(
                new Shoe("Flamingo X40Z", "Zapatilla hergonómica", "Flamingo's shoes", 39, 45.00, "https://img01.ztat.net/article/spp-media-p1/1267bf345af54c17bb7a1352de962459/0061687a198349d9b28dddb54a109cde.jpg?imwidth=1800"),
                new Shoe("Flamingo XZ700", "Zapatilla old school", "Flamingo's shoes", 37, 80.00, "https://img01.ztat.net/article/spp-media-p1/1267bf345af54c17bb7a1352de962459/0061687a198349d9b28dddb54a109cde.jpg?imwidth=1800")

        ));
    }
}
