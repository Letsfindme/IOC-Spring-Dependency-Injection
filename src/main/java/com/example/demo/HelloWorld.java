package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;







@RestController
public class HelloWorld {


    @Autowired
    @Qualifier("SomeText")
    TextWriter text;

    @Autowired
    @Qualifier("Imp2")
    TextWriter text2;


    @RequestMapping("/")
    public String index(){
        return  text2.WriteText("hi");
    }
}
