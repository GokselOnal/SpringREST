package com.restapi.musicstore.controllers;

import com.restapi.musicstore.entities.StringsEntity;
import com.restapi.musicstore.services.StringsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/strings")
public class StringsController {
    @Autowired
    private final StringsService stringsService;

    public StringsController(StringsService stringsService) {
        this.stringsService = stringsService;
    }

    @GetMapping
    public List<StringsEntity> findAllStrings(){
        return stringsService.findAllStrings();
    }

    @GetMapping("/{id}")
    public Optional<StringsEntity> findStringId(@PathVariable("id") Long id){
        return stringsService.findById(id);
    }

    @PostMapping
    public StringsEntity saveEmployee(@RequestBody StringsEntity stringsEntity){
        return stringsService.saveString(stringsEntity);
    }

    @PutMapping
    public StringsEntity updateString(@RequestBody StringsEntity stringsEntity){
        return stringsService.updateString(stringsEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteString(@PathVariable("id") Long id){
        stringsService.deleteString(id);
    }
}
