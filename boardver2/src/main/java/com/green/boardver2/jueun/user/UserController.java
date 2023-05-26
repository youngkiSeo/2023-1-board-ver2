package com.green.boardver2.jueun.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 회원가입
@RestController("jueunUserController")
@RequestMapping("/jueun/user")
public class UserController {

    @PostMapping
    int postUser(){
        return 0;
    }
}
