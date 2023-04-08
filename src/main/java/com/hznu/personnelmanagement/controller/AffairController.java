package com.hznu.personnelmanagement.controller;


import com.hznu.personnelmanagement.entity.Affair;
import com.hznu.personnelmanagement.service.AffairService;
import com.hznu.personnelmanagement.service.tool.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/affair")
public class AffairController {
    @Autowired
    AffairService affairService;
    @GetMapping("/getAffairList")
    public Resp getAffairList(){
        List<Affair> affairList=affairService.list();
        return Resp.ok(affairList);

    }

}
