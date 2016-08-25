package yuan.spring.boot.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yuan.spring.boot.test.mapper.AckTradeBlotterMapper;
import yuan.spring.boot.test.model.AckTradeBlotter;

import javax.annotation.Resource;

/**
 * Created by yuanxin on 16/8/19.
 */
@Service("ackTradeBlotterService")
public class AckTradeBlotterService {

    @Autowired
    private AckTradeBlotterMapper ackTradeBlotterMapper;

    public AckTradeBlotter getAckBlotter(){
        AckTradeBlotter ackTradeBlotter = ackTradeBlotterMapper.selectByPrimaryKey(29039l);
        return ackTradeBlotter;
    }
}
