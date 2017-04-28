package yuan.spring.boot.service;

import org.springframework.stereotype.Service;
import yuan.spring.boot.mapper.cluster.CityMapper;
import yuan.spring.boot.model.City;

import javax.annotation.Resource;

/**
 * Created by yuanxin on 17/4/14.
 */
@Service("cityService")
public class CityService
{
    @Resource
    CityMapper cityMapper;

    public City  selectCityById(){
        City city = cityMapper.selectByPrimaryKey(1l);
        return city;
    }

}
