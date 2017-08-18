package org.TestSpringIoc.Test87.classmag.service.impl;

import javax.annotation.Resource;

import org.TestSpringIoc.Test87.beans.ClassBean;
import org.TestSpringIoc.Test87.beans.StudenBean;
import org.TestSpringIoc.Test87.classmag.dao.IClassDao;
import org.TestSpringIoc.Test87.classmag.service.IClassService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
@Service
public class ClassServiceImpl implements IClassService {
	@Resource
	private IClassDao classDaoImpl;
	

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public void addClass(ClassBean CB) {
		classDaoImpl.addClass(CB);
	}

	public void deleteClass(long id) {
		
	}

	public StudenBean selectstuByClassId(long id) {
		return null;
	}

}
