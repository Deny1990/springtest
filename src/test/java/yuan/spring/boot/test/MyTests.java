package yuan.spring.boot.test; /**
 * Created by yuanxin on 17/4/27.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import yuan.spring.boot.controller.UserController;
import yuan.spring.boot.model.User;
import yuan.spring.boot.service.UserService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTests {

    @MockBean
    private UserService userService;

    @Autowired
    private UserController userController;

    @Test
    public void exampleTest() {
        List<User> userList = new ArrayList<>();
        User user = new User("hello","world");
        user.setAge(33333);
        userList.add(user);
        given(this.userService.queryAllUsers()).willReturn(userList);
        List<User> users = userController.getAllUser();

        List<User> userList2 = new ArrayList<>();
        User user2 = new User("hello","world");
        user2.setAge(33444333);
        userList2.add(user2);

        assertEquals(userList,userList2);
    }



}
