package com.green.boardver2.model.user;

import lombok.Data;
import org.springframework.web.bind.annotation.Mapping;

import java.util.Date;

@Data
public class UserInsDto {
    private String uid;
    private String upw;
    private String nm;
    private char gender;
    private String addr;
    private String main_pic;
    private String createdAt;
    private String updatedAt;
}
