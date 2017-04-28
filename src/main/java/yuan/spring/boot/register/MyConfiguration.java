package yuan.spring.boot.register;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.Filter;

/**
 * Created by yuanxin on 17/4/28.
 */
@Configuration
public class MyConfiguration {

    @Bean
    protected FilterRegistrationBean filterRegistrationBean(@Qualifier("shanhyB") Shanhy shanhy) {
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
        shanhy.display();
        Filter filter = new CommonsRequestLoggingFilter();
        filterRegistration.setFilter(filter);
        // 省略代码
        return filterRegistration;
    }
}

