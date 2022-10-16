package com.restapi.musicstore.services.implement;

import com.restapi.musicstore.entities.WindsEntity;
import com.restapi.musicstore.repositories.WindsRepository;
import com.restapi.musicstore.services.WindsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WindsServiceImplement implements WindsService {

    @Autowired
    private final WindsRepository windsRepository;

    public WindsServiceImplement(WindsRepository windsRepository) {
        this.windsRepository = windsRepository;
    }


    @Override
    public List<WindsEntity> findAllWinds() {
        return windsRepository.findAll();
    }

    @Override
    public Optional<WindsEntity> findById(Long id) {
        return windsRepository.findById(id);
    }

    @Override
    public WindsEntity saveWind(WindsEntity windsEntity) {
        return windsRepository.save(windsEntity);
    }

    @Override
    public WindsEntity updateWind(WindsEntity windsEntity) {
        return windsRepository.save(windsEntity);
    }

    @Override
    public void deleteWind(Long id) {
        windsRepository.deleteById(id);
    }
}
