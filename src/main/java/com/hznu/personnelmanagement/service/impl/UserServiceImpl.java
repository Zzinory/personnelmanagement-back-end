package com.hznu.personnelmanagement.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hznu.personnelmanagement.entity.User;
import com.hznu.personnelmanagement.mapper.UserMapper;
import com.hznu.personnelmanagement.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Zzinory
 * @since 2023-02-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User findUser(User user) {
        return this.getOne(new QueryWrapper<User>().eq("user_account", user.getUserAccount()));
    }


}
