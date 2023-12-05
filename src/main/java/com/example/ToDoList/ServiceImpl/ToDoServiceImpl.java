package com.example.ToDoList.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDoList.Entity.ToDo;
import com.example.ToDoList.Repository.ToDoRepository;
import com.example.ToDoList.Service.ToDoService;

@Service
public class ToDoServiceImpl implements ToDoService {
	@Autowired
	private ToDoRepository todorepo;

	@Override
	public ToDo createTodo(ToDo todo) {
		
		return todorepo.save(todo);
	}

	@Override
	public ToDo getToDoById(int id) {
		
		return todorepo.getById(id);
	}

	@Override
	
	public ToDo updateTodo(ToDo todo) {
	ToDo tempToDo = todorepo.getById(todo.getId());
	tempToDo.setStatus(todo.getStatus());
	tempToDo.setCreatedAt(todo.getCreatedAt());
	tempToDo.setDescription(todo.getDescription());
	tempToDo.setTitle(todo.getTitle());
	return tempToDo;
	}

	@Override
	public void deleteToDoById(int id) {
		todorepo.deleteById(id);
		
	}
	

	}

	

