package com.atguigu.gmall0901.service;

import com.atguigu.gmall0901.bean.UserAddress;
import com.atguigu.gmall0901.bean.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<UserInfo> findall();

    List<UserAddress> findUserAddressByUserId(String userId);

}
