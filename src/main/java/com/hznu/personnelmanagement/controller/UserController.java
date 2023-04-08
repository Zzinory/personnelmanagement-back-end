package com.hznu.personnelmanagement.controller;


import cn.hutool.extra.pinyin.PinyinUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hznu.personnelmanagement.entity.User;
import com.hznu.personnelmanagement.service.UserService;
import com.hznu.personnelmanagement.service.tool.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Zzinory
 * @since 2023-02-18
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping( "/create")

    public Resp create(@RequestBody User user){
        //只需要给入userName，设置默认密码123456，暂未加盐,token无
        user.setUserName(user.getUserName());
        user.setUserAccount(PinyinUtil.getPinyin(user.getUserName(),"")+ UUID.randomUUID().toString().substring(0,2));
        user.setPassword("123456");
        user.setQuitDate(null);
        userService.save(user);
        return Resp.ok();
    }

    @PostMapping("/login")

    public Resp login(@RequestBody User user){
        Assert.notNull(user.getUserAccount(), "账户为空");
        Assert.notNull(user.getPassword(), "密码为空");
        User testifyUser = userService.findUser(user);
//        return Resp.ok();
        if (testifyUser==null){
            return Resp.err("用户不存在");
        }
        else {
            if (testifyUser.getPassword().equals(user.getPassword()))
                return Resp.ok("登录成功"+testifyUser.getRole());
            else
                return Resp.err("密码错误");

        }
    }
    @GetMapping("/getUserList")
    public Resp getUserList(){

        List<User> listUser = userService.list();

        return Resp.ok(listUser);
    }

    @PostMapping("/getUser")
    public Resp getUser(@RequestBody User user){
        User thisUser = userService.findUser(user); //通过账户名查用户 登录用

        return Resp.ok(thisUser);
    }
    @PostMapping("/getUserById")
    public Resp getUserById(@RequestBody User user){
        User thisUser = userService.getOne(new QueryWrapper<User>().eq("id", user.getId())); //通过id查用户

        return Resp.ok(thisUser);
    }


    @PostMapping("/modifyUser")
    public Resp modifyUser(@RequestBody User user){
        User thisUser = userService.findUser(user);
        if (thisUser==null) {
            if (userService.updateById(user))
                return Resp.ok();
            else
                return Resp.err("修改失败");
        }
        else{
            if(thisUser.getId()==user.getId())//不改账号只改别的的情况
            {
                if (userService.updateById(user))
                    return Resp.ok();
                else
                    return Resp.err("修改失败");
            }
            else
                return Resp.err("账户重复，请修改");
        }
    }



}
