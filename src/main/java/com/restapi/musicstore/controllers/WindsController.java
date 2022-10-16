package com.restapi.musicstore.controllers;

import com.restapi.musicstore.entities.WindsEntity;
import com.restapi.musicstore.services.WindsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/winds")
public class WindsController {
    @Autowired
    private final WindsService windsService;

    public WindsController(WindsService windsService) {
        this.windsService = windsService;
    }


    @GetMapping
    public List<WindsEntity> findAllStrings(){
        return windsService.findAllWinds();
    }

    @GetMapping("/{id}")
    public Optional<WindsEntity> findWindsId(@PathVariable("id") Long id){
        return windsService.findById(id);
    }

    @PostMapping
    public WindsEntity saveWind(@RequestBody WindsEntity windsEntity){
        return windsService.saveWind(windsEntity);
    }

    @PutMapping
    public WindsEntity updateWind(@RequestBody WindsEntity windsEntity){
        return windsService.updateWind(windsEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteWind(@PathVariable("id") Long id){
        windsService.deleteWind(id);
    }
}
