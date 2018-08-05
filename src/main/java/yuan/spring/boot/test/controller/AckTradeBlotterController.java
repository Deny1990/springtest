package yuan.spring.boot.test.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yuan.spring.boot.test.service.ZoneService;

/**
 * Created by yuanxin on 16/8/19.
 */
@Controller
public class AckTradeBlotterController {

    private Logger logger = Logger.getLogger(AckTradeBlotterController.class);

    @Autowired
    private ZoneService zoneService;

    /*
     *  http://localhost:8080/zone
     */
    @RequestMapping("/zone")
    @ResponseBody
    public void getUserInfo() {

        zoneService.initializeZoneConfig();
    }
}
