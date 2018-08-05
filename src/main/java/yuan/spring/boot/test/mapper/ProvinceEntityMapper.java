package yuan.spring.boot.test.mapper;


import yuan.spring.boot.test.model.ProvinceEntity;

public interface ProvinceEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProvinceEntity record);

    int insertSelective(ProvinceEntity record);

    ProvinceEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProvinceEntity record);

    int updateByPrimaryKey(ProvinceEntity record);
}