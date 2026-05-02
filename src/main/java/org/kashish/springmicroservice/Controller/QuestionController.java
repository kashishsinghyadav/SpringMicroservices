package org.kashish.springmicroservice.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/question")
@RestController
public class QuestionController {


    @GetMapping("/getAllQuestion")
    public String getAllQuestion(){
        return "Hello Radhe radhe";
    }




}
