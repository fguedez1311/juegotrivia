package com.fguedez.trivia;

import com.fguedez.trivia.entities.Category;
import com.fguedez.trivia.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {
    @Autowired
    CategoryRepository categoryRepository;
    @GetMapping("/question/{categoria}")
    public Category getQuestion(@PathVariable String categoria) {

        List<Category> resultado=new ArrayList<>();
        Category ejemplo=categoryRepository.findById(1L);
        resultado.add(ejemplo);
        return ejemplo;


    }
}
