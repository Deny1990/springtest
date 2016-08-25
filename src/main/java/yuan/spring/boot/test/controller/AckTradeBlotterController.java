package yuan.spring.boot.test.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yuan.spring.boot.test.model.AckTradeBlotter;
import yuan.spring.boot.test.service.AckTradeBlotterService;

/**
 * Created by yuanxin on 16/8/19.
 */
@Controller
public class AckTradeBlotterController {

    private Logger logger = Logger.getLogger(AckTradeBlotterController.class);

    @Autowired
    private AckTradeBlotterService ackTradeBlotterService;

    /*
     *  http://localhost:8080/getAckTradeBlotter
     */
    @RequestMapping("/getAckTradeBlotter")
    @ResponseBody
    public AckTradeBlotter getUserInfo() {
        AckTradeBlotter ackTradeBlotter = ackTradeBlotterService.getAckBlotter();
        if(ackTradeBlotter!=null){
            System.out.println("ackTradeBlotter.getApplyNo:"+ackTradeBlotter.getApplyNo());
            logger.info("ackTradeBlotter.getApkind:"+ackTradeBlotter.getApKind());
        }
        return ackTradeBlotter;
    }
}
