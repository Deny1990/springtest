package yuan.spring.boot.controller;

/**
 * Created by yuanxin on 16/8/19.
 */

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import yuan.spring.boot.register.Shanhy;
import yuan.spring.boot.springsource.aoptest.TestBean;

import javax.annotation.Resource;

@Controller
public class HelloController {

    private Logger logger = Logger.getLogger(HelloController.class);

    @Resource
    TestBean testBean;

    @Resource(name="shanhyA")
    private Shanhy shanhyA;

    @Resource(name="shanhyB")
    private Shanhy shanhyB;

    /*
    *   http://localhost:8080/hello?name=yuan
     */

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        logger.info("hello");
        model.addAttribute("name", name);
        testBean.test();
        return "hello";
    }

    private void test(){
        System.out.println();
    }

    @RequestMapping("/test")
    public void testRegis() {
        shanhyA.display();
        shanhyB.display();
    }



}