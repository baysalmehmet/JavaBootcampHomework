package com.todo.todo.controller;

import com.sun.istack.NotNull;
import com.todo.todo.entity.Item;
import com.todo.todo.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class Control {
    @Autowired
    private Repo repo;
    @GetMapping
    public List<Item> findAll(){
        return repo.findAll();
    }
    @PostMapping
    public Item save(@RequestBody Item item){
        return repo.save(item);
    }
    @PutMapping
    public Item update(@RequestBody Item item){return repo.save(item);}
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){repo.deleteById(id);}
}
