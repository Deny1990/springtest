package yuan.spring.boot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yuan.spring.boot.model.User;
import yuan.spring.boot.service.UserService;

import java.util.List;

/**
 * Created by yuanxin on 17/4/14.
 */
@Controller
public class UserController
{
    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser() {
        List<User> list = userService.queryAllUsers();
        return list;
    }
}
