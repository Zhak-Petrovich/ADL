package com.adl.test.repository;

import com.adl.test.model.Prj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Prj, Integer> {
   Prj getById(Integer id);
}
