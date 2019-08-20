package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getRoot(){
        return "helloworld";
    }

    @GetMapping("/sayHello")
    public String getSayHello(@RequestParam(required = false, defaultValue = "friend") String name, Model m){
        m.addAttribute("firstName", name);
        return "sayHello";
    }
    @GetMapping("/hello")
    public String gethello(){
        return "hello";
    }
    @GetMapping("/capitalize/{value}")
    public String getcapitalize(@PathVariable String value, Model m){
        m.addAttribute("word", value);
        return "capitalize";
    }
    @GetMapping("/reverse")
    public String getreverse(@RequestParam(required = false, defaultValue = "friend") String sentence, Model m){
        String reverse = reverseSentence(sentence);
        m.addAttribute("words", reverse);
        return "reverse";
    }
    public String reverseSentence(String sentence){
        String[] splitSentence = sentence.split(" ");
        String tempHolder = "";
        int j = 0;
        for ( int i = 0; i < splitSentence.length / 2; i++ ) {
            tempHolder = splitSentence[i];
            j = splitSentence.length - 1 - i;
            splitSentence[i] = splitSentence[j];
            splitSentence[j] = tempHolder;
        }
        return String.join(" ", splitSentence);
    }
}
