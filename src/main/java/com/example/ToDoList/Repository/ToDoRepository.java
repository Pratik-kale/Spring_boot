package com.example.ToDoList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ToDoList.Entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer> {

}
