package com.adl.test.repository;

import com.adl.test.model.AssemblyType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssemblyDetTypeRepository extends CrudRepository<AssemblyType, Integer> {
    Optional<AssemblyType> findById(Integer id);
}
