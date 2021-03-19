package com.cos.mybatisex01.config;


import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class DataAccessConfig { // Data에 접근하는 = DB에 접근하는 Config
	//Connection = 연결만
	//SqlSession  /session = 연결과 인증이 끝남
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		//SqlSessionFactory = sqlsession을 생성해주는 공장
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources("mapper/*.xml")); //getResources=경로(mapper/*.xml) 설정
		return sessionFactoryBean.getObject();
	} //공장 생성
	
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	} //세션 생성
	
}
