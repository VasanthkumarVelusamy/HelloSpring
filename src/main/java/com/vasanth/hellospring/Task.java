package com.vasanth.hellospring;

import java.util.Date;

public class Task {
    String name;
    Date dueDate;
    Boolean completed;

    public Task(String name, Date dueDate, Boolean completed) {
        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
