package yuan.spring.boot.test.controller;

/**
 * Created by yuanxin on 16/8/19.
 */
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    private Logger logger = Logger.getLogger(HelloController.class);

    /*
    *   http://localhost:8080/hello?name=yuan
     */

    @RequestMapping("/hello")
    public String greeting() {
        logger.info("hello");
        return "hello";
    }

}