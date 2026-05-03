package org.kashish.springmicroservice.Service;


import org.kashish.springmicroservice.Dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;



}
