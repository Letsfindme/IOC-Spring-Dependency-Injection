package com.example.demo;


import org.springframework.stereotype.Component;



@Component
public class TextWriteImp implements TextWriter {

    @Override
    public String WriteText(String s) {
        return s +" some text";
    }
}
