package org.TestSpringIoc.Test87.stumag.service;

import org.TestSpringIoc.Test87.beans.StudenBean;

public interface IStudentService {

	//添加学生
	public void addstu(StudenBean stu);
	//删除学生
	public void deletestu(long num);
	//查看学生
	public StudenBean selectstu(long num);
}
