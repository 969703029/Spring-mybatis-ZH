package org.TestSpringIoc.Test87.classmag.mapper;

import org.TestSpringIoc.Test87.beans.ClassBean;
import org.TestSpringIoc.Test87.beans.StudenBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface ClassMapper {

	@Insert("insert into t_class (f_classname,f_time) values(#{CB.className},#{CB.classtime})")
	public void addClass(@Param("CB")ClassBean CB);
	
	public void deleteClass(long id);
	
	public StudenBean selectstuByClassId(long id);
}
