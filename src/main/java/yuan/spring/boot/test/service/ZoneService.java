package yuan.spring.boot.test.service;

import org.springframework.stereotype.Service;

import java.util.List;

import yuan.spring.boot.test.mapper.AreaZoneMapper;
import yuan.spring.boot.test.mapper.CityEntityMapper;
import yuan.spring.boot.test.mapper.ProvinceEntityMapper;
import yuan.spring.boot.test.model.AreaZone;
import yuan.spring.boot.test.model.CityEntity;
import yuan.spring.boot.test.model.ProvinceEntity;

import javax.annotation.Resource;

/**
 * Created by yuanxin on 16/8/19.
 */
@Service("zoneService")
public class ZoneService {

    @Resource
    AreaZoneMapper areaZoneMapper;

    @Resource
    ProvinceEntityMapper provinceEntityMapper;

    @Resource
    CityEntityMapper cityEntityMapper;

    public void initializeZoneConfig() {

        List<AreaZone> zoneList = areaZoneMapper.selectAll();

        for (AreaZone areaZone :
                zoneList) {
            String provinceCode = areaZone.getProvince();
            String cityCode = areaZone.getCity();
            String zone = areaZone.getZone();

            StringBuffer provinceBuffer = new StringBuffer();
            StringBuffer cityBuffer = new StringBuffer();
            provinceBuffer.append(provinceCode).append("0000");
            cityBuffer.append(cityCode).append("00");

            boolean isProvince = provinceBuffer.toString().equals(cityBuffer.toString())
                    && cityBuffer.toString().equals(zone);
            if (isProvince) {
                //此地区是省级 插入省配置表

                ProvinceEntity provinceEntity = new ProvinceEntity();
                provinceEntity.setProvinceCode(provinceCode);
                provinceEntity.setProvinceName(areaZone.getAddress());
                provinceEntityMapper.insertSelective(provinceEntity);

            }
            boolean isCity = !(provinceBuffer.toString().equals(cityBuffer.toString()))
                    && cityBuffer.toString().equals(zone);
            if (isCity) {
                //此地区市级 插入市配置表
                CityEntity cityEntity = new CityEntity();
                cityEntity.setCityCode(cityCode);
                cityEntity.setCityName(areaZone.getAddress());
                cityEntity.setProvinceCode(provinceCode);
                cityEntityMapper.insertSelective(cityEntity);
            }

        }
    }
}
