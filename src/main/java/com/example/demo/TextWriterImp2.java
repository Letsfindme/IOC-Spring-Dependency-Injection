package com.example.demo;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Imp2")
public class TextWriterImp2 implements TextWriter {
    @Override
    public String WriteText(String s) {


        return s + " this is implementation 2";
    }
}
