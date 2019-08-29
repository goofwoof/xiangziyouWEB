package com.xzy.mybatis.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static SqlSessionFactory sqlSessionFactory = null;
	private MybatisUtil() {}
	static {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}
	public static <T> Object getMapper(Class<T> arg0) {
		return getSqlSession().getMapper(arg0);
	}
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession(true);
	}
}
