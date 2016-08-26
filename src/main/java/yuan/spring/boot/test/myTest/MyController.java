package yuan.spring.boot.test.myTest;

import org.apache.log4j.Logger;

/**
 * Created by yuanxin on 16/8/26.
 */
public class MyController {


    private static Logger logger = Logger.getLogger(MyController.class);


    public  void service(String name,String age){
        logger.info("mycontroller begin service");
        StringBuffer buffer = new StringBuffer();
        buffer.append(name).append("年龄").append(age);
        logger.info("buffer is"+buffer);
    }




    private static class MyControllerHolder {
        private static final MyController INSTANCE = new MyController();
    }
    private MyController (){}
    public static final MyController getInstance() {
        return MyController.MyControllerHolder.INSTANCE;
    }
}
