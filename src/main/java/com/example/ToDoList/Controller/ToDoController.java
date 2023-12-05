package com.example.ToDoList.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ToDoList.Entity.ToDo;
import com.example.ToDoList.Service.ToDoService;

@RestController
@RequestMapping("/api/todos")
public class ToDoController {
	@Autowired
	private  ToDoService todoService;
	 
    @PostMapping("/createTodo")
    public ResponseEntity<ToDo> createTodo(@RequestBody ToDo todo) {
        ToDo createdTodo = todoService.createTodo(todo);
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }
	
    
    @GetMapping("/getTodo/{id}")
    public ResponseEntity<ToDo> getTodoById(@PathVariable int id) {
        ToDo todo = todoService.getToDoById(id);
        if (todo != null) {
            return new ResponseEntity<>(todo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
    @PutMapping("/updateTodo/{id}")
    public ResponseEntity<ToDo> updateTodo(@PathVariable int id, @RequestBody ToDo updatedTodo) {
        updatedTodo.setId(id); 
        ToDo todo = todoService.updateTodo(updatedTodo);
        if (todo != null) {
            return new ResponseEntity<>(todo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
    @DeleteMapping("/deleteTodo/{id}")
    public ResponseEntity<Void> deleteTodoById(@PathVariable int id) {
        todoService.deleteToDoById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
