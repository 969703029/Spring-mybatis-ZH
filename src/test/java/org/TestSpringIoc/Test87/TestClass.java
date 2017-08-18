package org.TestSpringIoc.Test87;

import javax.annotation.Resource;

import org.TestSpringIoc.Test87.beans.ClassBean;
import org.TestSpringIoc.Test87.beans.StudenBean;
import org.TestSpringIoc.Test87.classmag.service.IClassService;
import org.TestSpringIoc.Test87.stumag.service.IStudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestClass {
	
	@Resource
	private IClassService classServiceImpl;

	@Test
	public void testAddMouse() {
		ClassBean CB = new ClassBean();
		CB.setClassName("J158");
		CB.setClasstime("2017-8-1");
		classServiceImpl.addClass(CB);
	}
}
