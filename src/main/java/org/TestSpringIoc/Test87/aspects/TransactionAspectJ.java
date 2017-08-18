package org.TestSpringIoc.Test87.aspects;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import utils.SessionUtil;
@Aspect
@Component
public class TransactionAspectJ {

	private SqlSession session;
	
	@Before(value="execution(* org.TestSpringIoc.Test87.classmag.dao.impl.*DaoImpl.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		this.session=SessionUtil.getSession();
		Object obj = jp.getTarget();
		Class<?> cls = obj.getClass();
		try {
			Method method = cls.getMethod("setSession", SqlSession.class);
			method.invoke(obj, this.session);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
//	@AfterReturning(value="execution(* org.TestSpringIoc.Test87.classmag.dao.impl.*DaoImpl.*(..))")
//	public void afterAdvice(JoinPoint jp) throws Exception{
//		this.session.commit();
//		this.session.close();
//	}
//	@AfterThrowing(pointcut="execution(public * org.TestSpringIoc.Test87.classmag.dao.impl.*DaoImpl.*(..))",throwing="th") 
//	public void afterThrowingAdvice(JoinPoint jp,Throwable th){
//		this.session.rollback();
//		this.session.close();
//		System.out.println(th);
//	}
}
