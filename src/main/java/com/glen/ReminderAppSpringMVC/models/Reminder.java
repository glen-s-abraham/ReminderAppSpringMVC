package com.glen.ReminderAppSpringMVC.models;

public class Reminder {
	private Integer id;
	private String title;
	private String task;
	public Reminder(Integer id, String title, String task) {
		this.id = id;
		this.title = title;
		this.task = task;
	}
	public Reminder() {
	
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	@Override
	public String toString() {
		return "Reminder [id=" + id + ", title=" + title + ", task=" + task + "]";
	}
	
}
