package org.TestSpringIoc.Test87.classmag.dao;

import org.TestSpringIoc.Test87.beans.ClassBean;
import org.TestSpringIoc.Test87.beans.StudenBean;

public interface IClassDao {

	public void addClass(ClassBean CB);
	
	public void deleteClass(long id);
	
	public StudenBean selectstuByClassId(long id);
}
