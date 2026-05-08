package org.kashish.springmicroservice.Service;


import org.kashish.springmicroservice.Dao.QuestionDao;
import org.kashish.springmicroservice.Dao.QuizDao;
import org.kashish.springmicroservice.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;


    @Autowired
    QuestionDao questionDao;


    public ResponseEntity<String> createQuiz(String category, String numq, String title) {
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questionDao.findRandomQuestiionByCategory(category));
        quizDao.save(quiz);
        return ResponseEntity.ok("Quiz Created Successfully");

    }


}
