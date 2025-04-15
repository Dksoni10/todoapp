package com.soni.todoapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soni.todoapp.Model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
