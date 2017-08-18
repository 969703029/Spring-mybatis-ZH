package org.TestSpringIoc.Test87.stumag.dao.impl;

import javax.annotation.Resource;

import org.TestSpringIoc.Test87.beans.StudenBean;
import org.TestSpringIoc.Test87.stumag.dao.IStudentDao;
import org.TestSpringIoc.Test87.stumag.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import utils.SessionUtil;

@Repository
public class StudentDaoImpl implements IStudentDao{
	
	@Resource
	private StudentMapper stuMapper;
	
	public void addstu(StudenBean stu) {
			stuMapper.addstu(stu);
	}

	public void deletestu(long num) {
			stuMapper.deletestu(num);
	}

	public StudenBean selectstu(long num) {
		StudenBean SB = stuMapper.selectstu(num);
		return SB;
	}

}
