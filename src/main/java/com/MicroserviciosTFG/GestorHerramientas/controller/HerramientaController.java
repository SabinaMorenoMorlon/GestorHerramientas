package com.MicroserviciosTFG.GestorHerramientas.controller;

import com.MicroserviciosTFG.GestorHerramientas.entity.HerramientaEntity;
import com.MicroserviciosTFG.GestorHerramientas.repository.HerramientaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/herramienta")
public class HerramientaController {

    @Autowired
    private HerramientaRepository herramientaRepository;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<HerramientaEntity> getAllHerramientas(){
        return herramientaRepository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createHerramienta(@RequestBody HerramientaEntity herramientaEntity){
        herramientaRepository.save(herramientaEntity);
    }

}
