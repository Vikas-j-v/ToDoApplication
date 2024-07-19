package com.example.ToDo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDo.model.Todo;
@Repository
public interface TodoRepo extends JpaRepository<Todo, Long> {
	

}
