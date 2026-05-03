package org.kashish.springmicroservice.Controller;


import org.kashish.springmicroservice.Service.QuestionService;
import org.kashish.springmicroservice.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/question")
@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @GetMapping("/getAllQuestion")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestions();
    }






}
