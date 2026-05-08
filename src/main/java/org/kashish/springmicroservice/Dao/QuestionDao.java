package org.kashish.springmicroservice.Dao;


import org.kashish.springmicroservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao  extends JpaRepository<Question,Integer> {

    List<Question> findByCategoryIgnoreCase(String category);

    @Query(value = "SELECT * FROM Question q  where q.category =: category  ORDER BY RANDOM() LIMIT 1",nativeQuery = true)
    List<Question> findRandomQuestiionByCategory(String category);
}
