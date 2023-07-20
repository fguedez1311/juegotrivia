package com.fguedez.trivia.repository;

import com.fguedez.trivia.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CategoryRepository {
    @PersistenceContext
    EntityManager entitymanager;
    public Category findById(Long id){
        return entitymanager.find(Category.class,id);
    }

}
