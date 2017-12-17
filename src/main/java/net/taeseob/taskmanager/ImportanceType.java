package net.taeseob.taskmanager;

public enum ImportanceType {
	CRITICAL("CRITICAL"),
	MAJOR("MAJOR"),
	NORMAL("NORMAL"),
	MINOR("MINOR");
	
	private String type;
	
	ImportanceType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
