package org.kashish.springmicroservice.Dao;

import org.kashish.springmicroservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
