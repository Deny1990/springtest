package yuan.spring.boot.controller;

import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import yuan.spring.boot.mapper.master.UserMapper;
import yuan.spring.boot.model.City;
import yuan.spring.boot.model.User;
import yuan.spring.boot.service.CityService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */
@RestController
@RequestMapping(value = "/users")
public class SwaggerController
{

    @Resource
    UserMapper userMapper;

    @Resource
    CityService cityService;
    /*
     *  http://localhost:8080/swagger/index.html
     */

    /**
     * @return
     */
    @ApiOperation(value = "Get all Users", notes = "requires noting")
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers()
    {
        List<User> list = userMapper.selectAllUsers();
        return list;
    }

    @ApiOperation(value = "Get Users with Age", notes = "requires the age of User")
    @RequestMapping(value = "/{age}", method = RequestMethod.GET)
    public List<User> getAckTradeByApKind(@PathVariable int age)
    {
        List<User> list = userMapper.selectByage(age);
        return list;
    }

    @ApiOperation(value = "Get City with id", notes = "requires the id of city")
    @RequestMapping( value = "/getCity", method = RequestMethod.GET)
    public City getCity()
    {
        City city = cityService.selectCityById();
        return city;
    }
}
