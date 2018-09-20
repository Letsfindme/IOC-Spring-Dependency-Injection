package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;







@RestController
public class HelloWorld {


    @Autowired
    TextWriter text;

    public HelloWorld(TextWriter text) {

        this.text = text;

    }


    @RequestMapping("/")
    public String index(){
        return  text.WriteText("hi");
    }
}
