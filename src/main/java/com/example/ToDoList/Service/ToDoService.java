package com.example.ToDoList.Service;

import com.example.ToDoList.Entity.ToDo;

public interface ToDoService {
	
	ToDo createTodo(ToDo todo);
	
	ToDo getToDoById(int id);
	
	ToDo updateTodo(ToDo todo);
	
	void deleteToDoById(int id);
	


}
