package com.Homework.todo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoList {
        private long Id;
        private String title;
        private boolean done;

    public TodoList() {
    }

    public TodoList(long id, String title, boolean done) {
        Id = id;
        this.title = title;
        this.done = done;
    }
    @Id
    @GeneratedValue
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
