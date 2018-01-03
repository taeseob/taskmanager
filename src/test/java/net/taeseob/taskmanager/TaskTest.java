package net.taeseob.taskmanager;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskTest {

	Task task = new Task();
	String title = "title";
	String description = "This is my new Task";
	
	Task taskGroup = new Task();
	Task subTask1 = new Task();
	Task subTask2 = new Task();
	
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
	
	@Test
	public void test_diff_task_id() {
		Task task2 = new Task();
		assertFalse(task.getTaskId().equals(task2.getTaskId()));
	}
	
	@Test(expected=DuplicatedTaskIdException.class)
	public void test_register_duplicated_task() throws DuplicatedTaskIdException {
		Task tempTask = new Task();
		TaskManager.registerTask(tempTask);
		TaskManager.registerTask(tempTask);
	}
	
	@Test
	public void test_add_sub_task_to_task_group() {
		assertTrue(TaskManager.addSubTask(taskGroup.getTaskId(), subTask1.getTaskId(), subTask2.getTaskId()));
	}
	
	@Test(expected=DuplicatedTaskIdException.class)
	public void test_add_duplicated_sub_task_to_task_group() {
		TaskManager.addSubTask(taskGroup.getTaskId(), subTask1.getTaskId(), subTask1.getTaskId());
	}
	
	@Test
	public void test_get_sub_task_from_task_group() {
		assertTrue(TaskManager.getSubTask(taskGroup.getTaskId()).contains(subTask1.getTaskId()));
		assertTrue(TaskManager.getSubTask(taskGroup.getTaskId()).contains(subTask2.getTaskId()));
	}
}
