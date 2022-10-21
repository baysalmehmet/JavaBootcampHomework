package com.Homework.todo.control;

import com.Homework.todo.entities.TodoList;
import com.Homework.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/todo")
public class TodoControl {
    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoList> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoList save(@RequestBody TodoList todoList){

        return todoRepo.save(todoList);
    }

    @PutMapping
    public TodoList update(@RequestBody TodoList todoList){
        return todoRepo.save(todoList);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable long id){
        todoRepo.deleteById(id);
    }
}
