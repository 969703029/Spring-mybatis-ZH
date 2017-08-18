package org.TestSpringIoc.Test87.classmag.dao.impl;

import javax.annotation.Resource;

import org.TestSpringIoc.Test87.beans.ClassBean;
import org.TestSpringIoc.Test87.beans.StudenBean;
import org.TestSpringIoc.Test87.classmag.dao.IClassDao;
import org.TestSpringIoc.Test87.classmag.mapper.ClassMapper;
import org.TestSpringIoc.Test87.stumag.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import utils.SessionUtil;

@Repository
public class ClassDaoImpl implements IClassDao {

	@Resource
	private ClassMapper classmapper;
	
//	public void setSession(SqlSession session) {
//		classmapper = session.getMapper(ClassMapper.class);
//	}

	public void addClass(ClassBean CB) {
			classmapper.addClass(CB);
	}

	public void deleteClass(long id) {
		
	}

	public StudenBean selectstuByClassId(long id) {
		
		
		return null;
	}

	
}
