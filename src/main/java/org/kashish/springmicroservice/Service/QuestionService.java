package org.kashish.springmicroservice.Service;


import org.kashish.springmicroservice.Dao.QuestionDao;
import org.kashish.springmicroservice.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {


    @Autowired
    QuestionDao questionDao;


    public List<Question> getAllQuestions() {
       return questionDao.findAll();

    }

    public List<Question> getAllQuestionsByCategory(String category) {
        return questionDao.findByCategoryIgnoreCase(category);
    }

    public String addQuesion(Question question) {
        questionDao.save(question);
        return "Question Added Successfully";
    }
}
