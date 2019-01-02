package com.kakaoix.todoapp.controller;

import com.kakaoix.todoapp.service.TodoItemService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    private TodoItemService todoService;

    public TodoController(TodoItemService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String home(@PageableDefault Pageable pageable, Model model) {
        model.addAttribute("todoList", todoService.getTodoList(pageable));
        return "todoList";
    }
}
