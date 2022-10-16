package com.restapi.musicstore.services;

import com.restapi.musicstore.entities.StringsEntity;

import java.util.List;
import java.util.Optional;

public interface StringsService {
    List<StringsEntity> findAllStrings();
    Optional<StringsEntity> findById(Long id);
    StringsEntity saveString(StringsEntity stringsEntity);
    StringsEntity updateString(StringsEntity stringsEntity);
    void deleteString(Long id);
}

