package com.in28minutes.data.api;

import java.util.Arrays;
import java.util.List;

import com.example.data.api.TodoService;

public class TodoServiceStub implements TodoService{

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring Mvc","Spring Boot","Microservices");
	}

}
