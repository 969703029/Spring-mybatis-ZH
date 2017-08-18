package org.TestSpringIoc.Test87.stumag.mapper;

import org.TestSpringIoc.Test87.beans.StudenBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.aspectj.lang.annotation.Pointcut;

public interface StudentMapper {
	
	//添加学生
	@Insert(value="insert into t_student (f_stuname,f_gender,f_birthday,fk_class) values(#{stu.stuName},#{stu.stuGender},#{stu.birthday},#{stu.cb.id})")
//	@Options(useGeneratedKeys=true,keyProperty="stu.id")//通过getId可以获取到新增的主键
	public void addstu(@Param("stu")StudenBean stu);
	//删除学生
	@Delete(value="delete from t_student where pk_stuId=#{num}")
	public void deletestu(long num);
	//查看学生
	@Select(value="SELECT f_stuname as stuName,f_gender as stuGender,f_birthday as birthday FROM t_student WHERE pk_stuId=#{num};")
	@ResultType(StudenBean.class)
	public StudenBean selectstu(long num);
}
