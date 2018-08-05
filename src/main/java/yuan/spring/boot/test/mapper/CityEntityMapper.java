package yuan.spring.boot.test.mapper;


import yuan.spring.boot.test.model.CityEntity;

public interface CityEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CityEntity record);

    int insertSelective(CityEntity record);

    CityEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CityEntity record);

    int updateByPrimaryKey(CityEntity record);
}