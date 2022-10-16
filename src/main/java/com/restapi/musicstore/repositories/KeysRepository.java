package com.restapi.musicstore.repositories;

import com.restapi.musicstore.entities.KeysEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeysRepository extends JpaRepository<KeysEntity, Long> {
}
