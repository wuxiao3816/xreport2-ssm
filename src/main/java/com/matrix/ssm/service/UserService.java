package com.matrix.ssm.service;

import com.matrix.ssm.pojo.TestUser;


import java.util.List;


public interface UserService {

     TestUser getUserById(Integer id);

     List<TestUser> getUserAll();

}
