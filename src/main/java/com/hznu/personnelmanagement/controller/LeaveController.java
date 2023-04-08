package com.hznu.personnelmanagement.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hznu.personnelmanagement.entity.Leavee;
import com.hznu.personnelmanagement.entity.User;
import com.hznu.personnelmanagement.service.LeaveService;
import com.hznu.personnelmanagement.service.tool.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@RequestMapping("/leave")
public class LeaveController {
    @Autowired
    LeaveService leaveService;

    @GetMapping("/getLeaveList")
    public Resp getLeaveList(){
        List<Leavee> leaveList =leaveService.list();
        return Resp.ok(leaveList);
    }
    @PostMapping("/submitLeave")
    public Resp submitLeave(@RequestBody Leavee leavee){
        if (leaveService.saveOrUpdate(leavee))
            return Resp.ok();
        else
            return Resp.err("更新失败");
    }
    @PostMapping("/getLeaveListById")
    public Resp getLeaveListById(@RequestBody User user){
        List<Leavee> userLeave = leaveService.list(new QueryWrapper<Leavee>().eq("user_id",user.getId()));

        return Resp.ok(userLeave);
    }

}
