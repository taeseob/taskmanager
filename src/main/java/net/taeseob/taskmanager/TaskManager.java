package net.taeseob.taskmanager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class TaskManager {
	private static Map<UUID, Task> taskMap = new HashMap<UUID, Task>();
	private static Map<UUID, Set<UUID>> taskGroupMap = new HashMap<UUID, Set<UUID>>();
	public static Task registerTask(Task task) throws DuplicatedTaskIdException {
		if (taskMap.containsKey(task.getTaskId())) {
			throw new DuplicatedTaskIdException(task.getTaskId());
		}
		return taskMap.put(task.getTaskId(), task);
	}
	
	public static boolean addSubTask(UUID taskGroupId, UUID... subTaskIds) {
		
		return true;
	}
	
	public static Set<Task> getSubTask(UUID taskGroupId) {
		return new HashSet<Task>();
	}
}
