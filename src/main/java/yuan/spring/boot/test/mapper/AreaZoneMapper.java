package yuan.spring.boot.test.mapper;


import java.util.List;

import yuan.spring.boot.test.model.AreaZone;

public interface AreaZoneMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AreaZone record);

    int insertSelective(AreaZone record);

    AreaZone selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AreaZone record);

    int updateByPrimaryKey(AreaZone record);


    List<AreaZone> selectAll();

}