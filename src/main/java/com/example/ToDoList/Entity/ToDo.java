package com.example.ToDoList.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo")
public class ToDo {
	
	public enum TodoStatus {
        TODO,
        IN_PROGRESS,
        DONE
    } 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String title;
	private String description;
	
	
	 @Enumerated(EnumType.STRING)
	 @Column(name = "status")
	 private TodoStatus status = TodoStatus.TODO;

	 @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
	 private LocalDateTime createdAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TodoStatus getStatus() {
		return status;
	}

	public void setStatus(TodoStatus status) {
		this.status = status;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "ToDoEntity [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status
				+ ", createdAt=" + createdAt + "]";
	}

	public ToDo(int id, String title, String description, TodoStatus status, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.createdAt = createdAt;
	}

	public ToDo() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

}
