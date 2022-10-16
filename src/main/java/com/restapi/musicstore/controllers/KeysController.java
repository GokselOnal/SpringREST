package com.restapi.musicstore.controllers;

import com.restapi.musicstore.entities.KeysEntity;
import com.restapi.musicstore.entities.WindsEntity;
import com.restapi.musicstore.services.KeysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/keys")
public class KeysController {
    @Autowired
    private final KeysService keysService;

    public KeysController(KeysService keysService) {
        this.keysService = keysService;
    }

    @GetMapping
    public List<KeysEntity> findAllKeys(){
        return keysService.findAllKeys();
    }

    @GetMapping("/{id}")
    public Optional<KeysEntity> findKeyId(@PathVariable("id") Long id){
        return keysService.findById(id);
    }

    @PostMapping
    public KeysEntity saveKey(@RequestBody KeysEntity windsEntity){
        return keysService.saveKey(windsEntity);
    }

    @PutMapping
    public KeysEntity updateKey(@RequestBody KeysEntity windsEntity){
        return keysService.updateKey(windsEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteKey(@PathVariable("id") Long id){
        keysService.deleteKey(id);
    }
}
