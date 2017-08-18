package org.TestSpringIoc.Test87.beans;

import java.io.Serializable;

public class ClassBean implements Serializable{

	private long id;
	private String className;
	private String classtime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClasstime() {
		return classtime;
	}
	public void setClasstime(String classtime) {
		this.classtime = classtime;
	}
	
}
