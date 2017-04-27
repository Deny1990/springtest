package yuan.spring.boot.springsource.aoptest;

import org.springframework.stereotype.Component;

/**
 * Created by yuanxin on 17/4/12.
 */
@Component
public class TestBean
{
    private String testStr ="testStr";
    public String getTestStr(){
        return testStr;
    }
    public void setTestStr(String testStr){
       this.testStr = testStr;
    }
    public void test(){
        System.out.println("test");
    }

}
