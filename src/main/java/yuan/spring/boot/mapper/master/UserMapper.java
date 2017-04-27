package yuan.spring.boot.mapper.master;

import org.apache.ibatis.annotations.Param;
import yuan.spring.boot.model.User;

import java.util.List;

/**
 * Created by yuanxin on 17/4/14.
 */
public interface UserMapper
{
    User selectByPrimaryKey(long id);

    List<User> selectAllUsers();

    List<User> selectByage(@Param("age")int age);
}
