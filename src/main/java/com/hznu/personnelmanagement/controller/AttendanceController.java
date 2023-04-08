package com.hznu.personnelmanagement.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hznu.personnelmanagement.entity.Attendance;
import com.hznu.personnelmanagement.entity.User;
import com.hznu.personnelmanagement.service.AttendanceService;
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
@RequestMapping("/attendance")
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;

    @GetMapping("/getAttendanceList")
    public Resp getAttendanceList(){
        List<Attendance>  attendanceList = attendanceService.list();
        return Resp.ok(attendanceList);
    }

    @PostMapping("/getUserAttendanceList")
    public Resp getUserAttendanceList(@RequestBody User user){
//        System.out.println(user.getId());
        List<Attendance>  attendanceList = attendanceService.list(new QueryWrapper<Attendance>().eq("user_id",user.getId()));
        return Resp.ok(attendanceList);
    }
    @PostMapping("/getUserAttendanceListNo")
    public Resp getUserAttendanceListNo(@RequestBody User user){
//        System.out.println(user.getId());
        List<Attendance>  attendanceList = attendanceService.list(new QueryWrapper<Attendance>().eq("user_id",user.getId()));
        return Resp.ok(attendanceList.size());
    }


    @PostMapping("/signIn")
    public Resp signIn(@RequestBody Attendance attendance){
        if (attendanceService.saveOrUpdate(attendance))
            return Resp.ok("打卡成功");
        else
            return Resp.err("打卡失败");
    }
    @PostMapping("/test")
    public Resp test(@RequestBody Attendance attendance){
        return Resp.ok(attendance);
    }


}
