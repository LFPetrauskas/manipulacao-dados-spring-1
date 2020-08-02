package com.challenge.repository;

import java.util.List;

import com.challenge.entity.Challenge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge, Long> {

    List<Challenge> findByAccelerationsIdAndAccelerationsCandidatesIdUserId(Long accelerationId, Long userId);
}