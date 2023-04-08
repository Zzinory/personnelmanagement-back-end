package com.hznu.personnelmanagement.controller;


import com.hznu.personnelmanagement.service.OvertimeService;
import com.hznu.personnelmanagement.service.tool.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/overtime")
public class OvertimeController {
    @Autowired
    OvertimeService overtimeService;

    @GetMapping("/test")
    public Resp test(){
        return Resp.ok("123");
    }
//    @PostMapping("/")



}
