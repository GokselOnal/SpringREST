package com.restapi.musicstore.services.implement;

import com.restapi.musicstore.entities.KeysEntity;
import com.restapi.musicstore.repositories.KeysRepository;
import com.restapi.musicstore.services.KeysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KeysServiceImplement implements KeysService {

    @Autowired
    private final KeysRepository keysRepository;

    public KeysServiceImplement(KeysRepository keysRepository) {
        this.keysRepository = keysRepository;
    }


    @Override
    public List<KeysEntity> findAllKeys() {
        return keysRepository.findAll();
    }

    @Override
    public Optional<KeysEntity> findById(Long id) {
        return keysRepository.findById(id);
    }

    @Override
    public KeysEntity saveKey(KeysEntity keysEntity) {
        return keysRepository.save(keysEntity);
    }

    @Override
    public KeysEntity updateKey(KeysEntity keysEntity) {
        return keysRepository.save(keysEntity);
    }

    @Override
    public void deleteKey(Long id) {
        keysRepository.deleteById(id);
    }
}
