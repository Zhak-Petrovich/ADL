package com.adl.test.repository;

import com.adl.test.model.Detail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("detailRepository")
public interface DetailRepository extends JpaRepository<Detail, Integer> {
    @Query("SELECT d from Detail d where d.id < 200")
    List<Detail> findDetails();
}
