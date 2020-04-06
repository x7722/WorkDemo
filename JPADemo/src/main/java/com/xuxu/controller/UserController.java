package com.xuxu.controller;

import com.xuxu.pojo.Result;
import com.xuxu.pojo.User;
import com.xuxu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*****
 *  @author Monster Xu
 *  用户的控制层
 *****/
@RestController
@RequestMapping("/user")
@CrossOrigin    //开启跨域访问
public class UserController {

    //注入service
    @Autowired
    private UserService userService;


    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/findAll")
    public Result findAll(){
        List<User> userList = userService.findAll();

        return new Result(true,"查询成功",userList);
    }


    @PostMapping("/add")
    public Result add(@RequestBody User user){
        userService.add(user);

        return new Result(true,"添加用户成功");
    }

}
