package com.adl.test.repository;

import com.adl.test.model.MaterialType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MaterialTypeRepository extends CrudRepository<MaterialType, Integer> {
    Optional<MaterialType> findById(Integer id);
}
