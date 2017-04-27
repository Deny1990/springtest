package yuan.spring.boot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by yuanxin on 16/8/19.
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);

    /**
     * Main Start
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("============= SpringBoot Start Success =============");
    }
}
