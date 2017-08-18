package org.TestSpringIoc.Test87.beans;

import java.io.Serializable;

public class StudenBean implements Serializable {

	private String stuName;
	private String stuGender;
	private String birthday;
	private ClassBean cb;
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuGender() {
		return stuGender;
	}
	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public ClassBean getCb() {
		return cb;
	}
	public void setCb(ClassBean cb) {
		this.cb = cb;
	}
	@Override
	public String toString() {
		return "StudenBean [stuName=" + stuName + ", stuGender=" + stuGender + ", birthday=" + birthday + "]";
	}
	
}
