package com.Homework.todo.repository;

import com.Homework.todo.entities.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoList, Long> {
}
