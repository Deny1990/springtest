package yuan.spring.boot.register;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by yuanxin on 17/4/14.
 */
public class DynamicDataSourceRegister implements ImportBeanDefinitionRegistrar,EnvironmentAware
{
    @Override
    public void setEnvironment(Environment environment)
    {

    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
        BeanDefinitionRegistry beanDefinitionRegistry)
    {

    }
}