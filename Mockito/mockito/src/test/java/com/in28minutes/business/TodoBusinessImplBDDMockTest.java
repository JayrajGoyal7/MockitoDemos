package com.in28minutes.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.example.business.TodoBusinessImpl;
import com.example.data.api.TodoService;

public class TodoBusinessImplBDDMockTest {

	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock() {
		// Given  - > use in place of when and willReturn in place of thenReturn
		TodoService todoServiceMock = mock(TodoService.class);

		List<String> todos = Arrays.asList("Learn Spring Mvc","Spring Boot","Microservices");
		given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todos);
		
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		// When
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		// Then
//		assertThat(filteredTodos.size(),is(2));

	}

}
