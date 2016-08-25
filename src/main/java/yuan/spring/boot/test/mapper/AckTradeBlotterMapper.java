package yuan.spring.boot.test.mapper;


import yuan.spring.boot.test.model.AckTradeBlotter;

/**
 * Created by yuanxin on 16/8/18.
 */
public interface AckTradeBlotterMapper {

    AckTradeBlotter selectByPrimaryKey(Long id);

}
