package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController //To create REST service
public class BooksController {
    @GetMapping("/books")
    public List<Book> BooksController(){
        return Arrays.asList(new Book(1l,"Spring book","Ranga"));
    }
}
