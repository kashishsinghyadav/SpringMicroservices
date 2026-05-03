package org.kashish.springmicroservice.Controller;


import org.kashish.springmicroservice.Service.QuestionService;
import org.kashish.springmicroservice.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/question")
@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @GetMapping("/getAllQuestion")
    public ResponseEntity<List<Question>> getAllQuestion(){
        try{
            return  new ResponseEntity<>(questionService.getAllQuestions(),HttpStatus.OK) ;

        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("category/{category}")
    public  ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){

        try{
            return new ResponseEntity<>(questionService.getAllQuestionsByCategory(category),HttpStatus.OK) ;

        }
        catch (Exception e){

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @PostMapping("/addQuestion")
    public String addQuestion(@RequestBody Question question){
      return questionService.addQuesion(question);

    }






}
