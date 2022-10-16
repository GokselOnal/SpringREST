package com.restapi.musicstore.repositories;

import com.restapi.musicstore.entities.WindsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindsRepository extends JpaRepository<WindsEntity, Long> {
}
