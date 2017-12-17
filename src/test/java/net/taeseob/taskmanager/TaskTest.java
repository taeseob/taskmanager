package net.taeseob.taskmanager;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskTest {

	Task task = new Task();
	String title = "title";
	String description = "This is my new Task";
	
	@Test
	public void test_set_task_name() {
		task.setTitle(title);
		assertTrue(title.equals(task.getTitle()));
	}
	
	// 리팩토링 하고 나니 중복 된 코드가 됨
//	@Test
//	public void test_change_Task_name() {
//		name = "anotherName";
//		Task.setName(name);
//		assertTrue(name.equals(Task.getName()));
//	}
	
	@Test
	public void test_set_task_description() {
		task.setDescription(description);
		assertTrue(description.equals(task.getDescription()));
	}
}
