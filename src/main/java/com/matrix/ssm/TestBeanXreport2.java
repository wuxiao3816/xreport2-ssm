package com.matrix.ssm;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.matrix.ssm.dao.TestUserMapper;
import com.matrix.ssm.pojo.TestUser;
/**
 * @author Jacky.gao
 * @since 2017年2月7日
 */
public class TestBeanXreport2 {
	
	 @Autowired
    private TestUserMapper testUserMapper;
	
    public List<TestUser> loadReportData(String dsName,String datasetName,Map<String,Object> parameters){
    	
    	
    	List<TestUser> list= testUserMapper.selectUserAll();
    	
    	
        return list;
    }
    public List<Map<String,Object>> buildReport(String dsName,String datasetName,Map<String,Object> parameters){
        return null;
    }
}