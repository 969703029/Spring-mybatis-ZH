package org.TestSpringIoc.Test87.classmag.service;

import org.TestSpringIoc.Test87.beans.ClassBean;
import org.TestSpringIoc.Test87.beans.StudenBean;

public interface IClassService {

	public void addClass(ClassBean CB);
	
	public void deleteClass(long id);
	
	public StudenBean selectstuByClassId(long id);
}
