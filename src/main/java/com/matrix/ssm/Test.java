package com.matrix.ssm;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.matrix.ssm.dao.TestUserMapper;
import com.matrix.ssm.pojo.TestUser;


public class Test {
	public static void main(String[] args) throws IOException {
		String resource = "com/matrix/ssm/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		TestUserMapper mapper = sqlSessionFactory.openSession().getMapper(TestUserMapper.class);
		TestUser blog = mapper.selectByPrimaryKey(1);
//		mapper.ssssssss();
		System.out.println(blog.getUserName());
	
//		System.out.println(1025	&(Modifier.ABSTRACT | Modifier.PUBLIC | Modifier.STATIC));
	}
}
