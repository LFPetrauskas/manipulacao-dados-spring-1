package com.challenge.repository;

import java.util.List;

import com.challenge.entity.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    List<Company> findDistinctByCandidatesIdAccelerationId(Long accelerationId);

    List<Company> findByCandidatesIdUserId(Long userId);

}