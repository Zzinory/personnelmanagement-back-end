package com.hznu.personnelmanagement.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hznu.personnelmanagement.entity.Salary;
import com.hznu.personnelmanagement.entity.User;
import com.hznu.personnelmanagement.service.SalaryService;
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
@RequestMapping("/salary")
public class SalaryController {
    @Autowired
    SalaryService salaryService;

    @GetMapping("/test")
    public Resp test(){
        return Resp.ok("123");
    }

    @PostMapping("/getSalaryListByUserId")
    public Resp getSalaryListByUserId(@RequestBody User user){
        List<Salary> userSalary = salaryService.list(new QueryWrapper<Salary>().eq("user_id",user.getId()));

        return Resp.ok(userSalary);
    }

}
