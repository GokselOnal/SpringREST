package com.restapi.musicstore.services;

import com.restapi.musicstore.entities.WindsEntity;

import java.util.List;
import java.util.Optional;

public interface WindsService {
    List<WindsEntity> findAllWinds();
    Optional<WindsEntity> findById(Long id);
    WindsEntity saveWind(WindsEntity windsEntity);
    WindsEntity updateWind(WindsEntity windsEntity);
    void deleteWind(Long id);
}
