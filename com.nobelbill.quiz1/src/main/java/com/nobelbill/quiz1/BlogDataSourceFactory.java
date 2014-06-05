package com.nobelbill.quiz1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BlogDataSourceFactory {

	public static SqlSessionFactory getSessionFactory() throws IOException,
			ClassNotFoundException, SQLException {
		String resource = "mybatis-config.xml";
		InputStreamReader isr = new InputStreamReader(
				Resources.getResourceAsStream(resource));
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(isr);
		return sqlSessionFactory;
	}
}
