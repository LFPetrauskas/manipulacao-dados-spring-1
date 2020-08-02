package com.challenge.repository;

import java.math.BigDecimal;
import java.util.List;

import com.challenge.entity.Submission;
import com.challenge.entity.SubmissionId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, SubmissionId> {

    @Query(value = "select nvl(max(score), 0) from submission where challenge_id = ?1", nativeQuery = true)
    BigDecimal findHigherScoreByChallengeId(Long challengeId);

    @Query(value = "select * from submission s inner join acceleration a  on s.challenge_id=a.challenge_id " +
            "where s.challenge_id=?1 and a.id=?2", nativeQuery = true)
    List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId);
}