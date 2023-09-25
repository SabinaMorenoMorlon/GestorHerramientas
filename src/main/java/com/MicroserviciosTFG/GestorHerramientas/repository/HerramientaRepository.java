package com.MicroserviciosTFG.GestorHerramientas.repository;

import com.MicroserviciosTFG.GestorHerramientas.entity.HerramientaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HerramientaRepository extends MongoRepository<HerramientaEntity,Integer> {

}
