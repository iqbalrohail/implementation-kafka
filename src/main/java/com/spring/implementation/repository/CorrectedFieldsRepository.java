package com.spring.implementation.repository;

import com.spring.implementation.domain.CorrectedFieldsDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorrectedFieldsRepository extends JpaRepository<CorrectedFieldsDomain , Integer> {
}
