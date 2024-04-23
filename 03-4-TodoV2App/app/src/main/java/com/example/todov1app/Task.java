package com.example.todov1app;

import java.io.Serializable;

public class Task implements Serializable {
    String name, description, priority;

    public Task(String name, String description, String priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(String priority) { this.priority = priority; }

    public String getPriority() { return priority; }

    public void raisePriority() {
        if ("Low".equals(priority)) {
            this.priority = "Medium";
        } else if ("Medium".equals(priority)) {
            this.priority = "High";
        }
    }

    @Override
    public String toString() { return getName(); }
}
