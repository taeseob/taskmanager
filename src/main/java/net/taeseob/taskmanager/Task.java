package net.taeseob.taskmanager;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

public class Task {
	private UUID taskId;
	private UUID taskGroupId;
	private Set<UUID> subTaskIds;
	private String title;
	private String description;
	private Date dueDate;
	private Integer priority;
	private ImportanceType importance;
	private Set<UUID> priorGroupIds;
	private Set<UUID> subsequentGroupIds;
	// taskGroup, subTask, prior, subseq : 다른 객체가 관리하도록 할 수 있지 않을까? 책임?
	// dueDate, priority, importance는 어떨까?
	
	public Task() {
		this.taskId = UUID.randomUUID();
	}
	
	public UUID getTaskId() {
		return taskId;
	}
//	public void setTaskId(UUID taskId) {
//		this.taskId = taskId;
//	}
	public UUID getTaskGroupId() {
		return taskGroupId;
	}
	public void setTaskGroupId(UUID taskGroupId) {
		this.taskGroupId = taskGroupId;
	}
	public Set<UUID> getSubTaskIds() {
		return subTaskIds;
	}
	public void setSubTaskIds(Set<UUID> subTaskIds) {
		this.subTaskIds = subTaskIds;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public ImportanceType getImportance() {
		return importance;
	}
	public void setImportance(ImportanceType importance) {
		this.importance = importance;
	}
	public Set<UUID> getPriorGroupIds() {
		return priorGroupIds;
	}
	public void setPriorGroupIds(Set<UUID> priorGroupIds) {
		this.priorGroupIds = priorGroupIds;
	}
	public Set<UUID> getSubsequentGroupIds() {
		return subsequentGroupIds;
	}
	public void setSubsequentGroupIds(Set<UUID> subsequentGroupIds) {
		this.subsequentGroupIds = subsequentGroupIds;
	}
}
