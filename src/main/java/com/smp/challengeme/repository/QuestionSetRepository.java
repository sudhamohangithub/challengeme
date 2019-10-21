package com.smp.challengeme.repository;

import com.smp.challengeme.model.entity.QuestionSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionSetRepository extends JpaRepository<QuestionSet, Long> {
}

