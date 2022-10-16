package com.restapi.musicstore.services.implement;

import com.restapi.musicstore.entities.StringsEntity;
import com.restapi.musicstore.repositories.StringsRepository;
import com.restapi.musicstore.services.StringsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StringsServiceImplement implements StringsService {

    @Autowired
    private final StringsRepository stringsRepository;

    public StringsServiceImplement(StringsRepository stringsRepository) {
        this.stringsRepository = stringsRepository;
    }

    @Override
    public List<StringsEntity> findAllStrings() {
        return stringsRepository.findAll();
    }

    @Override
    public Optional<StringsEntity> findById(Long id) {
        return stringsRepository.findById(id);
    }

    @Override
    public StringsEntity saveString(StringsEntity stringsEntity) {
        return stringsRepository.save(stringsEntity);
    }

    @Override
    public StringsEntity updateString(StringsEntity stringsEntity) {
        return stringsRepository.save(stringsEntity);
    }

    @Override
    public void deleteString(Long id) {
        stringsRepository.deleteById(id);
    }
}
