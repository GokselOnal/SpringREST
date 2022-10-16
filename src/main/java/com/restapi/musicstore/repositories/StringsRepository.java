package com.restapi.musicstore.repositories;

import com.restapi.musicstore.entities.StringsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StringsRepository extends JpaRepository<StringsEntity, Long> {
}
