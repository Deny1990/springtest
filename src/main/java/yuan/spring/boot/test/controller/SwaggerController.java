package yuan.spring.boot.test.controller;


import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import yuan.spring.boot.test.model.AckTradeBlotter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */
@RestController
@RequestMapping(value="/ackTrades")
public class SwaggerController {

    /*
     *  http://localhost:8080/swagger/index.html
     */

    /**
     *
     * @return
     */
    @ApiOperation(value="Get all AckTradeBlotter",notes="requires noting")
    @RequestMapping(method=RequestMethod.GET)
    public List<AckTradeBlotter> getUsers(){
        List<AckTradeBlotter> list=new ArrayList<AckTradeBlotter>();

        AckTradeBlotter ackTradeBlotter=new AckTradeBlotter();
        ackTradeBlotter.setApKind("124");
        list.add(ackTradeBlotter);

        AckTradeBlotter ackTradeBlotter1=new AckTradeBlotter();
        ackTradeBlotter1.setApKind("120");
        list.add(ackTradeBlotter1);
        return list;
    }

    @ApiOperation(value="Get AckTradeBlotter with ApKind",notes="requires the ApKind of AckTradeBlotter")
    @RequestMapping(value="/{apKind}",method=RequestMethod.GET)
    public AckTradeBlotter getAckTradeByApKind(@PathVariable String apKind){
        AckTradeBlotter ackTradeBlotter=new AckTradeBlotter();
        ackTradeBlotter.setApKind("apKind");
        return ackTradeBlotter;
    }
}
