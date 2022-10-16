package com.restapi.musicstore.services;

import com.restapi.musicstore.entities.KeysEntity;

import java.util.List;
import java.util.Optional;

public interface KeysService {
    List<KeysEntity> findAllKeys();
    Optional<KeysEntity> findById(Long id);
    KeysEntity saveKey(KeysEntity keysEntity);
    KeysEntity updateKey(KeysEntity keysEntity);
    void deleteKey(Long id);
}
