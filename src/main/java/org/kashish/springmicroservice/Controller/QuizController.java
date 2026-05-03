package org.kashish.springmicroservice.Controller;


import org.kashish.springmicroservice.Service.QuizService;
import org.kashish.springmicroservice.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/quiz")
@RestController
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<String> getAllQuiz(@RequestParam String category, @RequestParam String numq , @RequestParam String title){



    }
}
