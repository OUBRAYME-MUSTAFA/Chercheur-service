package com.example.chercheurservice.we;

import com.example.chercheurservice.entities.Chercheur;
import com.example.chercheurservice.repository.ChercheurRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChercheurRestController {

    ChercheurRepository chercheurRepository;

    public ChercheurRestController(ChercheurRepository chercheurRepository) {
        this.chercheurRepository = chercheurRepository;
    }

    @PostMapping("/addChercheur")
    public Chercheur addChercheur(@RequestBody Chercheur chercheur){
        return chercheurRepository.save(chercheur);

    }

    @GetMapping(path = "/getChercheur/{name}")
    public Chercheur getChercheur(@PathVariable(name = "name") String  name){
        Chercheur chercheur = chercheurRepository.findByName(name);

        return chercheur;
    }



}
