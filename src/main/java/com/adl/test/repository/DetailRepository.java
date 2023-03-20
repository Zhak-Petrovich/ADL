package com.adl.test.repository;

import com.adl.test.model.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
