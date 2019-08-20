package com.matrix.ssm.dao;

import com.matrix.ssm.pojo.TestUser;
import com.matrix.ssm.pojo.TestUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
public interface TestUserMapper extends TestMapper {
    int countByExample(TestUserExample example);
    
    public default void ssssssss() {
    	
    }
    
    int deleteByExample(TestUserExample example);

    int insert(TestUser record);

    int insertSelective(TestUser record);
    
    TestUser selectByPrimaryKey(int id);
    
    List<TestUser> selectUserAll();
    
    List<TestUser> selectByExample(TestUserExample example);

    int updateByExampleSelective(@Param("record") TestUser record, @Param("example") TestUserExample example);

    int updateByExample(@Param("record") TestUser record, @Param("example") TestUserExample example);
}