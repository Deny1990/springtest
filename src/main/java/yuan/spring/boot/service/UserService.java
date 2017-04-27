package yuan.spring.boot.service;

import org.springframework.stereotype.Service;
import yuan.spring.boot.mapper.master.UserMapper;
import yuan.spring.boot.model.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yuanxin on 17/4/14.
 */
@Service("userService")
public class UserService
{
    @Resource
    UserMapper userMapper;

    public List<User> queryAllUsers(){
        List<User> list = userMapper.selectAllUsers();
        return list;
    }
}
