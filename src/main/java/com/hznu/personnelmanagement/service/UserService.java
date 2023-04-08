package com.hznu.personnelmanagement.service;

import com.hznu.personnelmanagement.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Zzinory
 * @since 2023-02-18
 */
public interface UserService extends IService<User> {
    User findUser(User user);
}
