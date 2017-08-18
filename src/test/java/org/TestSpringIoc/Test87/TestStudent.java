package org.TestSpringIoc.Test87;

import javax.annotation.Resource;

import org.TestSpringIoc.Test87.beans.ClassBean;
import org.TestSpringIoc.Test87.beans.StudenBean;
import org.TestSpringIoc.Test87.stumag.service.IStudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jdk.nashorn.internal.ir.annotations.Ignore;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestStudent {

	@Resource
	private IStudentService studentServiceImpl;

	@Test
	public void testAddMouse() {
		ClassBean CB = new ClassBean();
		CB.setId(1l);
		StudenBean stu = new StudenBean();
		stu.setStuName("王宝强");
		stu.setStuGender("男");
		stu.setBirthday("1996-4-28");
		stu.setCb(CB);
		studentServiceImpl.addstu(stu);
	}
	
	@Ignore
	public void testdeletestu(){
		StudenBean SB = studentServiceImpl.selectstu(8l);
		Assert.assertNotNull(SB);
		studentServiceImpl.deletestu(8l);
	}
}
