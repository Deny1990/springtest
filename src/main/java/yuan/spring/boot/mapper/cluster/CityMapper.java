package yuan.spring.boot.mapper.cluster;

import yuan.spring.boot.model.City;

/**
 * Created by yuanxin on 17/4/14.
 */
public interface CityMapper
{
    City selectByPrimaryKey(long id);
}
