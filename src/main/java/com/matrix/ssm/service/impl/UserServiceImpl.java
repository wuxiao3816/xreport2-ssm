package  com.matrix.ssm.service.impl;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrix.ssm.dao.TestUserMapper;
import com.matrix.ssm.pojo.TestUser;
import com.matrix.ssm.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    
    @Autowired
    private TestUserMapper testUserMapper;
    
    @Override
    public TestUser getUserById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		TestUserMapper mapper = session.getMapper(TestUserMapper.class);
	      TestUser testUser = mapper.selectByPrimaryKey(1);
		return	testUser;
		
    }

    @Override
    public List<TestUser> getUserAll() {
        return testUserMapper.selectUserAll();
    }

  

   
}
