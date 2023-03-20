package com.adl.test.repository;

import com.adl.test.model.LifeVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetailLifeRepository extends JpaRepository<LifeVersion, Integer> {
    Optional<LifeVersion> findById(Integer id);
}
