package com.green.boardver2.syk.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("sykUserController")
@RequestMapping("/syk/user")
public class UserController {
    @PostMapping
    public int Postyser(){
        return 0;
    }
}