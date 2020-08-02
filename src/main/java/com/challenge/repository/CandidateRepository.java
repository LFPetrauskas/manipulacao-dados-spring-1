package com.challenge.repository;

import java.util.List;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, CandidateId> {
    
    Optional<Candidate> findByIdUserIdAndIdCompanyIdAndIdAccelerationId(Long userId, Long companyId, Long accelerationId);

    List<Candidate> findByIdCompanyId(Long companyId);
    
    List<Candidate> findByIdAccelerationId(Long accelerationId);

}