package utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionUtil {

	private static SqlSessionFactory sf;
	private static ThreadLocal<SqlSession> local = new ThreadLocal<SqlSession>(){
		protected SqlSession initialValue() {
			return sf.openSession();
		};
	};
	
	
	static{
		
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream("conf.xml");
			sf = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession(){
		SqlSession session = local.get();
		if(session != null){
			return session;
		}else{
			session = sf.openSession();
			local.set(session);
		}
		return session;
	}
}
