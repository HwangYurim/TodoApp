package com.kakaoix.todoapp;

import com.kakaoix.todoapp.domain.TodoItem;
import com.kakaoix.todoapp.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappApplication implements CommandLineRunner {

	@Autowired
	private TodoItemRepository todoItemRepository;

	@Override
	public void run(String... args) throws Exception {
		todoItemRepository.save(new TodoItem("자바스터디", 1));
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

}

