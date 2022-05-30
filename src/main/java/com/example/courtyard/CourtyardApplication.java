package com.example.courtyard;

import com.example.courtyard.entity.Announcement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MappedTypes(Announcement.class)
//@MapperScan("com.example.courtyard.mapper")
@SpringBootApplication
public class CourtyardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourtyardApplication.class, args);
    }

}
