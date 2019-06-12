package com.bean;

public class ProjectBean {
	
	private long id;
	private String title;
	private String Tech;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTech() {
		return Tech;
	}
	public void setTech(String tech) {
		Tech = tech;
	}
	@Override
	public String toString() {
		return "ProjectBean [id=" + id + ", title=" + title + ", Tech=" + Tech + "]";
	}
	
	

}
