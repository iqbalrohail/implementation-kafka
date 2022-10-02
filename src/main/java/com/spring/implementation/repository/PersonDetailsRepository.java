package com.spring.implementation.repository;

import com.spring.implementation.domain.PersonDetailsDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDetailsRepository extends JpaRepository<PersonDetailsDomain , Integer> {
}
