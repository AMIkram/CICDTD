package com.javaguides.springbootfirstapp.repository;

import com.javaguides.springbootfirstapp.model.Todo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TodoRepository extends JpaRepository<Todo, Long>{
    List<Todo> findByUserName(String user);

}