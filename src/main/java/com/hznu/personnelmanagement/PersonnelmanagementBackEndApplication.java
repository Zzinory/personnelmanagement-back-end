package com.hznu.personnelmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com/hznu/personnelmanagement/mapper")

@SpringBootApplication
public class PersonnelmanagementBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonnelmanagementBackEndApplication.class, args);
    }

}
