package com.adl.test.repository;

import com.adl.test.model.Detail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("detailRepository")
public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
