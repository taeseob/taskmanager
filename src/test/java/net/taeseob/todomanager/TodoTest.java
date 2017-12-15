package net.taeseob.todomanager;

import static org.junit.Assert.*;

import org.junit.Test;

public class TodoTest {

	Todo todo = new Todo();
	String title = "title";
	String description = "This is my new todo";
	
	@Test
	public void test_set_todo_name() {
		todo.setTitle(title);
		assertTrue(title.equals(todo.getTitle()));
	}
	
	// 리팩토링 하고 나니 중복 된 코드가 됨
//	@Test
//	public void test_change_todo_name() {
//		name = "anotherName";
//		todo.setName(name);
//		assertTrue(name.equals(todo.getName()));
//	}
	
	@Test
	public void test_set_todo_description() {
		todo.setDescription(description);
		assertTrue(description.equals(todo.getDescription()));
	}
}
