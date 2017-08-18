package org.TestSpringIoc.Test87.stumag.service.impl;

import javax.annotation.Resource;

import org.TestSpringIoc.Test87.beans.StudenBean;
import org.TestSpringIoc.Test87.stumag.dao.IStudentDao;
import org.TestSpringIoc.Test87.stumag.service.IStudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//@Transactional(readOnly=true)
@Service
public class StudentServiceImpl implements IStudentService {
	
	@Resource
	private IStudentDao studentDaoImpl;
	
//	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public void addstu(StudenBean stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.addstu(stu);
	}

//	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public void deletestu(long num) {
		// TODO Auto-generated method stub
		studentDaoImpl.deletestu(num);
	}
	
//	@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public StudenBean selectstu(long num) {
		// TODO Auto-generated method stub
		StudenBean SB = studentDaoImpl.selectstu(num);
		return SB;
	}


}
