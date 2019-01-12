package com.atguigu.gmall0901.usermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0901.bean.UserAddress;
import com.atguigu.gmall0901.bean.UserInfo;
import com.atguigu.gmall0901.service.UserService;
import com.atguigu.gmall0901.usermanage.mapper.UserAddressMapper;
import com.atguigu.gmall0901.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> findall() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> findUserAddressByUserId(String userId) {
      UserAddress userAddress=  new UserAddress();
      userAddress.setUserId(userId);
      List<UserAddress> userAddressList = userAddressMapper.select(userAddress);

        return userAddressList;
    }
}
