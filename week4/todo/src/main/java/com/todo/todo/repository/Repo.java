package com.todo.todo.repository;

import com.todo.todo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Item, Long> {
}
